@Test
    public void testNewStrings() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
       
        strings.add("tr");
        String result = app.findLongestCommonPrefix(strings);
        assertEquals("tr", result);
    }
}
