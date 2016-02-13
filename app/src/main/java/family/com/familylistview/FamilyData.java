package family.com.familylistview;

/**
 * Created by Apple on 12/02/16.
 */
public class FamilyData
{
    private int family_pics;
    private String member_names;
    private String Relations;

    public int getFamily_pics() {
        return family_pics;
    }
    public FamilyData (int family_pics,String member_names,String relations)
    {this.setFamily_pics(family_pics);
    this.setMember_names(member_names);
    this.setRelations(relations);
    }

    public void setFamily_pics(int family_pics) {
        this.family_pics = family_pics;
    }

    public String getMember_names() {
        return member_names;
    }

    public void setMember_names(String member_names) {
        this.member_names = member_names;
    }

    public String getRelations() {
        return Relations;
    }

    public void setRelations(String relations) {
        Relations = relations;
    }
}
