package assessments;

import java.util.*;

public class antennaprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antenna ant[] = new Antenna[4];
        for (int i = 0; i < 4; i++)
        {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();

            ant[i] = new Antenna(a, b, c, d);
        }

        String inputAntennaName = sc.nextLine();
        double inputAntennaVSWR = sc.nextDouble();
        int id = searchAntennaByName(ant, inputAntennaName);

        if (id == 0)
            System.out.println("There is no antenna with given parameter");
        else
            System.out.println(id);

        Antenna res[] = sortAntennaByVSWR(ant, inputAntennaVSWR);

        if (res == null)
            System.out.println("No antenna found");
        else {
            for (Antenna a : res) {
                System.out.println(a.getProjectLead());
            }
        }
    }

    public static int searchAntennaByName(Antenna ant[], String inputAntennaName) {

        for (int i = 0; i < ant.length; i++) {
            if (ant[i].getAntennaName().equalsIgnoreCase(inputAntennaName)) {
                return ant[i].getAntennaid();
            }
        }

        return 0;
    }

    public static Antenna[] sortAntennaByVSWR(Antenna ant[], double inputAntennaVSWR) {

        int k = 0;

        for (int i = 0; i < ant.length; i++) {
            if (ant[i].getAntennaVSWR() < inputAntennaVSWR) {
                k++;
            }
        }

        if (k == 0)
            return null;

        Antenna arr[] = new Antenna[k];

        int index = 0;

        for (int i = 0; i < ant.length; i++) {
            if (ant[i].getAntennaVSWR() < inputAntennaVSWR) {
                arr[index++] = ant[i];
            }
        }

        // Bubble Sort (Ascending VSWR)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].getAntennaVSWR() > arr[j + 1].getAntennaVSWR()) {

                    Antenna temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}

class Antenna {

    private int antennaid;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    public Antenna(int antennaid, String antennaName,
                   String projectLead, double antennaVSWR) {

        this.antennaid = antennaid;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getAntennaid() {
        return antennaid;
    }

    public void setAntennaid(int antennaid) {
        this.antennaid = antennaid;
    }

    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public double getAntennaVSWR() {
        return antennaVSWR;
    }

    public void setAntennaVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }
}