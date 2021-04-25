package spring;

public class MemberPrinter {

    public void print(Member member) {
        System.out.printf(
                "회원 정보 : ID=%d, E-mail=%s, name=%s, RegDate=%tF\n",
                member.getId(), member.getEmail(), member.getName(), member.getRegisterDateTime()
        );
    }
}
