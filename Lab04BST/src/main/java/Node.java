public class Node {
    private int key;
    private String value;
    private Node l;
    private Node r;
    private int nodeCount;
    public Node() {
        this.key = 0;
        this.value = null;
        this.l = null;
        this.r = null;
        this.nodeCount = 0;
    }
    public Node(int key, String value) {
        this.key = key;
        this.value = value;
        l = null;
        r = null;
        nodeCount = 1;
        // Ініціалізовано 1 для поточного вузла
    }
    public void enter(int key, String value) {
        if (key == this.key) {
            this.value = value;
            // Оновити значення, якщо ключ уже існує
        } else if (key < this.key) {
            if (l == null) {
                l = new Node(key, value);
            } else {
                l.enter(key, value);
            }
        } else {
            if (r == null) {
                r = new Node(key, value);
            } else {
                r.enter(key, value);
            }
        }
        nodeCount++;
        // Збільшення nodeCount після вставки
    }
    public void delete(int key) {
        Node parent = null;
        Node current = this;
        boolean isLeftChild = false;
        while (current != null && current.key != key) {
            parent = current;
            if (key < current.key) {
                current = current.l;
                isLeftChild = true;
            } else {
                current = current.r;
                isLeftChild = false;
            }
        }
        if (current == null) {
            return;
            // Вузол із заданим ключем не знайдено, нічого видалити
        }
        // Випадок 1: вузол, який потрібно видалити
        if (current.l == null && current.r == null) {
            if (current == this) {
                // Видалення кореневого вузла
                this.key = 0;
                this.value = null;
            } else {
                if (isLeftChild) {
                    parent.l = null;
                } else {
                    parent.r = null;
                }
            }
        }
        // Випадок 2: вузол, який потрібно видалити, має лише одного дочірнього елемента
        else if (current.r == null) {
            if (current == this) {
                // Видалення кореневого вузла з лівим потомком
                this.key = current.l.key;
                this.value = current.l.value;
                this.l = current.l.l;
                this.r = current.l.r;
            } else {
                if (isLeftChild) {
                    parent.l = current.l;
                } else {
                    parent.r = current.l;
                }
            }
        } else if (current.l == null) {
            if (current == this) {
                // Видалення кореневого вузла з правою дочірньою частиною
                this.key = current.r.key;
                this.value = current.r.value;
                this.l = current.r.l;
                this.r = current.r.r;
            } else {
                if (isLeftChild) {
                    parent.l = current.r;
                } else {
                    parent.r = current.r;
                }
            }
        }
        // Випадок 3: вузол, який потрібно видалити, має двох дітей
        else {
            Node success = getSuccessor(current);
            if (current == this) {
                // Видалення кореневого вузла із двома дочірніми елементами
                this.key = success.key;
                this.value = success.value;
            } else {
                if (isLeftChild) {
                    parent.l = success;
                } else {
                    parent.r = success;
                }
            }
        }
        nodeCount--;
        // Зменшити nodeCount після видалення
    }
    public String find(int key) {
        if (key == this.key) {
            return value;
        } else if (key < this.key) {
            return l != null ? l.find(key) : null;
        } else {
            return r != null ? r.find(key) : null;
        }
    }
    public void Unused() {
        if (l != null) {
            l.Unused();
        }
        System.out.println(key + ": " + value);
        if (r != null) {
            r.Unused();
        }
    }
    public int getNodeCount() {
        return nodeCount;
    }
    private Node getSuccessor(Node n) {
        Node successorParent = n;
        Node ready = n;
        Node current = n.r;
        while (current != null) {
            successorParent = ready;
            ready = current;
            current = current.l;
        }
        if (ready != n.r) {
            successorParent.l = ready.r;
            ready.r = n.r;
        }
        ready.l = n.l;
        return ready;
    }
}
