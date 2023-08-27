package Fill;

enum Color {
    //Color end string, color reset
    BLACK("\033[0;30m"),    // BLACK
    WHITE("\033[0;37m"),    // WHITE
    RED("\033[0;31m"),      // RED
    GREEN("\033[0;32m"),    // GREEN
    YELLOW("\033[0;33m"),   // YELLOW
    BLUE("\033[0;34m"),     // BLUE
    MAGENTA("\033[0;35m"),  // MAGENTA
    CYAN("\033[0;36m"),     // CYAN
    RESET("\033[0m");

    private String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

    public static Color getColorByIndex(int index) {
        if (index < Color.values().length){
            return Color.values()[index];
        }else{
            System.out.println("INVALID COLOR");
            return CYAN;
        }
    }
}
