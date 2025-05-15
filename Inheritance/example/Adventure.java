class Story {
    void recite(int chapter) {}
}
class Adventure extends Story {
    final void recite(final int chapter) { // g1
        switch(chapter) { // g2
            default: System.out.print(3);
            case 2: System.out.print(9);
        }
    }


    public static void main(String ... u) {
    var bedtime = new Adventure();
    bedtime.recite(3);
    } 
    
}

