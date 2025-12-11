public class School {
  private String SchoolName;
  private Student[] studentss;
  private int count = 0;

  public School(String SchoolName, int numberofStudent) {
    this.SchoolName = SchoolName;
    this.studentss = new Student[numberofStudent];
    count++;
  }

  public void addStudent(Student students) {
    if (count < studentss.length) {
      studentss[count] = students;
      count++;
    } else {
      System.out.println("Can't add more numbers to " + SchoolName);
    }

  }

  public void showStudents() {
    System.out.println("School" + SchoolName);
    System.out.println("Students: ");
    for (int i = 0; i < count; i++) {
      System.out.println("-" + studentss[i].getName());
    }

  }
}
