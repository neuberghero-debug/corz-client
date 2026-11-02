package gg.corz;

import java.util.Locale;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_7923;

final class ilillIllIiillIll {
   final long[] iiiIIIilll;
   boolean ilIlIIilll;
   final String[] IIIlIIilll;
   final class_1792 iIiIIIilll;
   final long[] liiIIIilll;
   float IlllIIilll;
   float lIllIIilll;
   boolean IiIlIIilll;
   int llllIIilll;
   float IIllIIilll;
   final String lliIIIilll;
   final String IiiIIIilll;
   final String iliIIIilll;
   float liIlIIilll;
   llliilIlilliilIl iIIlIIilll;
   boolean IlIlIIilll;
   final class_1799 IliIIIilll;
   boolean llIlIIilll;
   float iiIlIIilll;
   float iIllIIilll;
   final iiiIiIIlIIIliIIl[] lIIlIIilll;
   String illlIIilll;

   ilillIllIiillIll(class_1792 item) {
      long var3 = 8571693312147115005L;
      super();
      this.liiIIIilll = new long[6];
      this.iiiIIIilll = new long[6];
      this.IIIlIIilll = new String[6];
      this.lIIlIIilll = new iiiIiIIlIIIliIIl[6];
      this.iIIlIIilll = llliilIlilliilIl.iIliiilIll;
      this.IlIlIIilll = true;
      this.llIlIIilll = true;
      this.ilIlIIilll = true;
      this.liIlIIilll = 1.0F;
      this.iiIlIIilll = Float.NaN;
      this.lIllIIilll = 1.0F;
      this.IlllIIilll = -1.0F;
      this.illlIIilll = "";
      this.iIiIIIilll = item;
      this.IliIIIilll = new class_1799(item);
      this.lliIIIilll = this.IliIIIilll.method_7964().getString();
      this.iliIIIilll = this.lliIIIilll.toLowerCase(Locale.ROOT);
      this.IiiIIIilll = class_7923.field_41178.method_10221(item).method_12832();

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 6; var5 += 4294967296L) {
         this.lIIlIIilll[(int)(var5 >>> 32)] = new iiiIiIIlIIIliIIl(0L);
         this.iiiIIIilll[(int)(var5 >>> 32)] = Long.MIN_VALUE;
      }
   }
}
