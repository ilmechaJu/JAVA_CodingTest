import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 학생들의 체육복 상태를 저장할 배열
        int[] students = new int[n];
        Arrays.fill(students, 1);  // 모든 학생은 1벌의 체육복을 갖고 시작

        // 도난당한 학생 체육복 개수 감소
        for (int l : lost) {
            students[l - 1]--;
        }

        // 여벌 체육복을 가진 학생 체육복 개수 증가
        for (int r : reserve) {
            students[r - 1]++;
        }

        // 체육복 빌려주기 로직
        for (int i = 0; i < n; i++) {
            if (students[i] == 0) { // 체육복이 없는 학생
                if (i > 0 && students[i - 1] == 2) {
                    // 앞 번호 학생에게 빌릴 수 있는 경우
                    students[i]++;
                    students[i - 1]--;
                } else if (i < n - 1 && students[i + 1] == 2) {
                    // 뒷 번호 학생에게 빌릴 수 있는 경우
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        // 체육복을 갖고 있는 학생 수 계산
        int answer = 0;
        for (int student : students) {
            if (student > 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
