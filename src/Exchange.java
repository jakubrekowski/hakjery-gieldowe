import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        TemplateRSI objRSI = new TemplateRSI();
        TemplateROC objROC = new TemplateROC();
        Scanner readLine = new Scanner(System.in);

        String isin = readLine.nextLine();

        System.out.println(objRSI.run(isin));
//        System.out.println(objROC.RunROC());

    }
}

/*
 todo:
    [ ] make class who read isin numbers from GPW site and save it to String[] array
 */