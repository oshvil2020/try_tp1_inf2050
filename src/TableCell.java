public class TableCell {
    protected final int percentage;
    protected final int maximum;

    public TableCell(int percentage, int maximum) {
        this.percentage = percentage;
        this.maximum = maximum;
    }

    public int getPercentage() {
        return percentage;
    }

    public int getMaximum() {
        return maximum;
    }
}
