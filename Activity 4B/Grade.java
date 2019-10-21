/**
 *Grade Calculations for comp1210.
 *Activity 4B
 *@author BoyangYu-COMP1210-001
 *@version 02/11/2018
 */
public class Grade {
   private double exam1, exam2, finalExam, 
      activityAvg, quizAvg, projectAvg;
   private String studentName;
   /**
    *@param EXAM_1 is exam type 1.
    *@param EXAM_2 is exam type 2.
    *@param FINAL is FINAL type 3.
    */

   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15, FINAL_WEIGHT = 0.30, 
      ACT_WEIGHT = 0.05, QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
   /**
    *@param studentNameIn is studentName which user give.
    */
   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   }
   /**
    *@param activityAvgIn is activityAvg what user give.
    *@param quizAvgIn is quizAvg that user give.
    */
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
      
   }
   /**
    *@param projectAvgIn is projectAvg that user set.
    */
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
   /**
    *@param examType is examType that user give.
    *@param examScoreIn is examScore that user type in.
    */
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
   /**
    *@return calculated grade.
    */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      return grade;
   }
   /**
    *@return name and grade.
    */
   public String toString() {
      return "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
   }
}