import java.util.Scanner;

void main(){
    int max = getMaxValue(new Scanner(System.in), 0);
    System.out.println(STR."Max value is=\{max}");
}

int getMaxValue(Scanner scanner, int iteration){
    System.out.print("Enter value: ");
    int value = scanner.nextInt();
    int maxValue;
    return ++iteration != 4 ? (maxValue = getMaxValue(scanner, iteration)) > value ? maxValue : value : value;
}
