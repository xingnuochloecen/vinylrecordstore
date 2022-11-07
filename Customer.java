import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class Customer {
     private static int idCount = 1;
    private String name;
    private String ID;
    private String email;
    private String telephone;
    private String homeaddress;

    public Customer()
    {
        setID(assignId());
    }

    public Customer(String name)
    {
        this.name = name;
    }

    public Customer(String name, String email, String telephone, String homeaddress)
    {
        setID(assignId());
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.homeaddress = homeaddress;
    }

    public Customer(String name, String ID, String email, String telephone, String homeaddress)
    {
        this.name = name;
        this.setID(ID);
        this.email = email;
        this.telephone = telephone;
        this.homeaddress = homeaddress;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        int idNum = Integer.parseInt(ID.substring(3));
        if (idNum >= idCount)
        {
            idCount = idNum + 1;
        }
        this.ID = ID;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getHomeaddress()
    {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress)
    {
        this.homeaddress = homeaddress;
    }

    private String assignId()
    {
        String toReturn = "OID" + Integer.toString(idCount);
        while (toReturn.length() < 7)
        {
            toReturn = toReturn.replaceFirst("OID", "OID0");
        }
        return toReturn;
    }

    @Override
    public String toString()
    {
        return "Owner{" + "name=" + name + ", ID=" + ID + ", email=" + email + ", telephone=" + telephone + ", homeaddress=" + homeaddress + '}';
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.ID != other.ID)
        {
            return false;
        }
        return true;
    }

    public String saveOut()
    {

        return name + "," + ID + "," + email + "," + telephone + "," + homeaddress;
    }

}
