package hello.core.member;

public class Member {
    //회원 엔티티(변수)
    private Long id;
    private String name;
    private Grade grade;
    
    //생성자
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //겟터셋터 : 데이터를 가지고오고 뽑는
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
