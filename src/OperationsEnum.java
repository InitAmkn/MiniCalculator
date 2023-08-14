import java.util.ArrayList;
import java.util.List;

public enum OperationsEnum {
    ADD("+"),
    SUBTRACT("-"),
    DIVIDE("/"),
    MULTIPLY("*");
    final String shortName;

    OperationsEnum(String shortName) {
        this.shortName = shortName;
    }

    public static String[] getAllShortNames() {
        List<String> allShortNames = new ArrayList<>();
        for (OperationsEnum item : OperationsEnum.values()) {
            allShortNames.add(item.shortName);
        }
        return allShortNames.toArray(new String[allShortNames.size()]);
    }

    @Override
    public String toString() {
        return shortName;
    }

    public static OperationsEnum getByShortName (String shortName)
    {
        for ( OperationsEnum item : values () )
        {
            if ( item.shortName.equals(shortName) )
            {
                return item ;
            }
        }
        return null ;
    }
}
