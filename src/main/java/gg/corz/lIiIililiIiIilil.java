package gg.corz;

public final class lIiIililiIiIilil {
   public static final int IiIiiIIlil = 2;
   public static final int liIiiIIlil = 8;
   public static final int ilIiiIIlil = 65;

   private lIiIililiIiIilil() {
   }

   public static String iIlIlllllill(String text, boolean allSelected, boolean isDelete) {
      if (allSelected) {
         return "";
      } else if (isDelete) {
         return text;
      } else {
         return text.isEmpty() ? "" : text.substring(0, text.length() - 1);
      }
   }

   public static String liiiIIllIl(String c, boolean text, char allSelected) {
      return text ? String.valueOf(allSelected) : c + allSelected;
   }

   public static boolean IliIlllilIi(boolean mac, int keyCode, int modifiers) {
      return keyCode == 65 && (mac && (modifiers & 8) != 0 || !mac && (modifiers & 2) != 0);
   }
}
