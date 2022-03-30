package datatables;

public class KeyList {
    private String key;
    private String value;

    public KeyList(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public KeyList setKey(String key) {
        this.key = key;
        return this;
    }

    public KeyList setValue(String value) {
        this.value = value;
        return this;
    }
}
