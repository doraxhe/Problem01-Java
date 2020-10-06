package cd.get.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(int value){
        String print;
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < value; i++) {
            if (((i + 1) % 3) == 0 && ((i + 1) % 5) != 0) {
                print = "Wu\n";
            }
            else if (((i + 1) % 5) == 0 && ((i + 1) % 3) != 0) {
                print = "Tang\n";
            }
            else if ((i + 1) % 15 == 0) {
                print = "WuTangForever\n";
            }
            else {
                print = (i + 1) + "\n";
            }
            string.append(print);
        }
        return string.toString();
    }
}
