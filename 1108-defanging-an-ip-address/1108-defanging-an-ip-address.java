class Solution {
    public String defangIPaddr(String address) {
        String result = address.replaceAll(".", "[.]");
        return address.replace(".", "[.]");
    }
}