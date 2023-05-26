public class SorterFactory {
    public static Sorter getSorter(SortingType type) {
        switch (type) {
            case BUBBLE:
                return new BubbleSorter();
            case SHELL:
                return new ShellSorter();
            case MERGE:
                return new MergeSorter();
            case QUICK:
                return new QuickSorter();
            default:
                throw new IllegalArgumentException("Недійсний тип сортування");
        }
    }
}
