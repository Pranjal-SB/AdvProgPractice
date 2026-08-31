import java.util.Arrays;
import java.util.Scanner;

class Candidate {
    int candidateId;
    String name;
    int aptitude, technical, communication;

    Candidate(int candidateId, String name, int aptitude, int technical, int communication) {
        this.candidateId = candidateId;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class Q6_TopKCandidates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Candidate[] candidates = new Candidate[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int aptitude = sc.nextInt();
            int technical = sc.nextInt();
            int communication = sc.nextInt();
            candidates[i] = new Candidate(id, name, aptitude, technical, communication);
        }

        Arrays.sort(candidates, (a, b) -> {
            if (b.getTotalScore() != a.getTotalScore()) {
                return b.getTotalScore() - a.getTotalScore();
            }
            return a.candidateId - b.candidateId;
        });

        for (int i = 0; i < k; i++) {
            Candidate c = candidates[i];
            System.out.println(c.candidateId + " " + c.name + " " + c.getTotalScore());
        }

        sc.close();
    }
}
