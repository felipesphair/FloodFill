package Fill;

enum Color {
    //Color end string, color reset
    BLACK("\033[0;30m"),    // BLACK
    WHITE("\033[0;37m"),    // WHITE
    RED("\033[0;31m"),      // RED
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
