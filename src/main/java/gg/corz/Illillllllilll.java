package gg.corz;

import java.util.ArrayList;
import net.minecraft.class_11719;
import net.minecraft.class_2583;
import net.minecraft.class_5224;
import net.minecraft.class_5251;
import net.minecraft.class_11719.class_11720;
import net.minecraft.class_11719.class_11721;

final class Illillllllilll implements class_5224 {
   private String lIiIllIIiiIiIllIIi;
   final ArrayList<llllIlllilllIlll> iIlIllIIiIllIllIIi = new ArrayList<>();
   private class_11719 iilIllIIiIIiIllIIi;
   private int IilIllIIililIllIIi;
   private final StringBuilder lllIllIIiillIllIIi = new StringBuilder(518863853 - -105 + -71 + 91 ^ 518863962);

   void liiiIIllIl() {
      if (this.lllIllIIiillIllIIi.length() != 0) {
         this.iIlIllIIiIllIllIIi.add(new llllIlllilllIlll(this.lllIllIIiillIllIIi.toString(), this.IilIllIIililIllIIi, this.lIiIllIIiiIiIllIIi));
         this.lllIllIIiillIllIIi.setLength(0);
      }
   }

   public boolean accept(int codePoint, class_2583 index, int style) {
      long var7 = -8781446073727787267L;
      class_5251 var4 = index.method_10973();
      var7 ^= ((long)(var4 == null ? -1 : var4.method_27716() & (~-335636606 * 117 * -1594008481 ^ 1289189568)) << 32 ^ var7) & -1L << 32;
      class_11719 var6 = index.method_27708();
      if (this.lllIllIIiillIllIIi.length() > 0 && ((int)(var7 >>> 32) != this.IilIllIIililIllIIi || !var6.equals(this.iilIllIIiIIiIllIIi))) {
         this.liiiIIllIl();
      }

      if (this.lllIllIIiillIllIIi.length() == 0) {
         this.IilIllIIililIllIIi = (int)(var7 >>> 32);
         if (!var6.equals(this.iilIllIIiIIiIllIIi)) {
            this.iilIllIIiIIiIllIIi = var6;
            this.lIiIllIIiiIiIllIIi = iIlIlllllill(var6);
         }
      }

      this.lllIllIIiillIllIIi.appendCodePoint(style);
      return true;
   }

   private Illillllllilll() {
      this.IilIllIIililIllIIi = -1;
   }

   private static String iIlIlllllill(class_11719 f) {
      if (f instanceof class_11721 var2) {
         return var2.comp_4590().toString();
      } else {
         return f instanceof class_11720 var1
            ? IilliliilIIi<"IilliliilIIi","HNVv8ZOZAxmUT9km5yodPxA2vaBzQayzZB2UXmwxwIANc94=">()
               + var1.comp_4588()
               + IilliliilIIi<"IilliliilIIi","eaQdv0WwsBS2HT6Hlp/bVDLulFq/EomUUM/v8uo=">()
               + var1.comp_4589()
            : IilliliilIIi<"IilliliilIIi","LmUaj/y6m1hyhzbe+6Gwxyg28gV/+nGvQ8JXvK951XQMrEQ=">();
      }
   }

   void IliIlllilIi() {
      this.iIlIllIIiIllIllIIi.clear();
      this.lllIllIIiillIllIIi.setLength(0);
      this.IilIllIIililIllIIi = -1;
      this.iilIllIIiIIiIllIIi = null;
      this.lIiIllIIiiIiIllIIi = null;
   }
}
