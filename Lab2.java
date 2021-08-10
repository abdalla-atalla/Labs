class Lab2 {

    public static boolean isPowerOfTwo(int x) {

        if (x == 0)
            return false;

        while (x != 1) {
            if (x % 2 != 0)
                return false;
            x = x / 2;
        }
        return true;
    }
}
