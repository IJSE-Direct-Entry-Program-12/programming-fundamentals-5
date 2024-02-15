import java.util.Scanner;

void main() {
    String minMaxPair = getMinMaxPair(new Scanner(System.in), 0);
    System.out.println(STR."(Min,Max)=\{minMaxPair}");
}

String getMinMaxPair(Scanner scanner, int iteration) {
    String pair;
    int min, max;
    do {
        System.out.print("Enter a value pair (x,y): ");
        pair = scanner.nextLine().trim();
        if (!pair.startsWith("(") || !pair.endsWith(")") || !pair.contains(",") ||
                pair.indexOf(",") != pair.lastIndexOf(",")) {
            System.out.println("\033[31mInvalid pair, try again\033[0m");
        } else break;
    } while (true);
    // (10,15) => 10,15) => 10,15
    pair = pair.replace("(", "").replace(")", "");
    int num1 = Integer.parseInt(pair.substring(0, pair.indexOf(",")).trim());
    int num2 = Integer.parseInt(pair.substring(pair.indexOf(",") + 1).trim());
    min = num1 < num2 ? num1 : num2;
    max = num2 > num1 ? num2 : num1;
    if (iteration != 3) {
        String previousPair = getMinMaxPair(scanner, ++iteration);
        previousPair = previousPair.replace("(", "").replace(")", "");
        int previousMin = Integer.parseInt(previousPair.substring(0, previousPair.indexOf(",")));
        int previousMax = Integer.parseInt(previousPair.substring(previousPair.indexOf(",") + 1));
        if (previousMin < min) min = previousMin;
        if (previousMax > max) max = previousMax;
    }
    return STR."(\{min},\{max})";
}