public abstract class ChessPiece {
    String color;
    boolean check = true;
    static boolean isDebugMode = false;

    public ChessPiece (String color) {
        this.color = color;
    }
    public abstract String getColor();
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();

    public boolean inBound(int toLine, int toColumn) {
        return toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7;
    }
    public boolean getTrue() {
        if (isDebugMode) System.out.println(" TRUE ");
        return true;
    }
    public boolean getFalse() {
        if (isDebugMode) System.out.println(" FALSE ");
        return false;
    }
}
