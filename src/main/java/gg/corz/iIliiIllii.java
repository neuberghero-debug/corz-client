package gg.corz;

import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1716;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_746;

public class iIliiIllii extends ilIllIiIll {
   private static final int llIillIlilIillIl = 9;
   private static final int iiIillIlIIlillIl = 45;
   private static final int IiIillIlliIillIl = 9;
   private int IiiillIlliiillIl;
   private final int[] lIIIilIliIIIilIl;
   private final class_1799[] iiiillIlIIIIilIl;
   private int ilIIilIlIiIIilIl;
   private int lliillIliliillIl;
   private final iiIiiilIIliiil lilillIliilillIl;
   private static final int lIlillIliIlillIl = 0;
   private ilIiiIIiIiIiiIIi iIiillIlIliillIl;
   private final iilliIlIIiliIl illillIlIilillIl = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","kTmM5xMviNq08wmfLF80BHWr1589jvW4b6WH6WqxerphYd0Gkuiz">(),
      IliIlllilIi<"IliIlllilIi","yy4748brjnL6+iSGZhTFFbEixwFsbIzOBqk8smvn5LdWjemYk7xsaF5cqpWoOuEIVIXzx+XdC4kgh/62GuYql7C19rEy6XLCoSj8PeWsRnGP3K06XMOjsTL8tOwWByGDcK4PV/ZpExU8faAFxO0g595C5pxB5wIwP9tCx3wFxVw=">(),
      0,
      0,
      10
   );
   private final Deque<int[]> IlIIilIlllIIilIl;
   private final iiIiiilIIliiil IIiillIllIiillIl;
   private static final int IllillIllllillIl = 1;

   public void lllllillll() {
      if (this.liIlliiIll()) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (var1 != null && var1.field_7512 instanceof class_1716 var2 && var2.field_7763 == this.IiiillIlliiillIl) {
            this.IlIIilIlllIIilIl.clear();
            this.ilIIilIlIiIIilIl = 0;
            boolean[] var8 = new boolean[45];
            int var4 = 0;

            for (int var5 = 0; var5 < 9; var5++) {
               if (var5 != this.lliillIliliillIl) {
                  class_1799 var6 = this.iiiillIlIIIIilIl[var5];
                  if (var6 != null && !var6.method_7960()) {
                     int var7 = this.liilliiill(var2, var6, var5, var8);
                     if (var7 < 0) {
                        var4++;
                     } else {
                        var8[var7] = true;
                        this.IlIIilIlllIIilIl.add(new int[]{0, var7, var5});
                     }
                  }
               }
            }

            this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.IlliIiiiil;
            if (var4 > 0) {
               this.llIililIil(
                  IliIlllilIi<"IliIlllilIi","quhuDRzWrsUixkKT1v8SfC3M/Os0SnFg06n7bzeLJ3Lu3LIrJrG4WlwbGlG4ObPuPSyxYbMeAUsjJtyupajzVb1KriHOsQ==">()
                     + var4
                     + IliIlllilIi<"IliIlllilIi","ReNeCmvlxdMrrkfm0yfnjv6RZNy9v87fYbXKG4GsywcOrnNMGfEc0BFVFAe+Vbn46hRaYsv0gDKQLQBHpFycMzPUKWeB2rij1g==">()
               );
            }
         } else {
            this.IIIillIIil(true);
         }
      }
   }

   private void iIIilIlIil() {
      this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.IIliIiiiil;
      this.lliillIliliillIl = -1;
      this.IiiillIlliiillIl = -1;
      this.IlIIilIlllIIilIl.clear();
      this.ilIIilIlIiIIilIl = 0;

      for (int var1 = 0; var1 < 9; var1++) {
         this.iiiillIlIIIIilIl[var1] = null;
         this.lIIIilIliIIIilIl[var1] = -1;
      }
   }

   private void Ilillllill(class_1657 p, int slot, int type, class_1713 button) {
      Iiiilllliiilll.field_1761.method_2906(this.IiiillIlliiillIl, slot, type, button, p);
   }

   public void iIlllIllll(int slot) {
      if (this.ilIllIiIll() && slot >= 0 && slot < 9) {
         class_746 var2 = Iiiilllliiilll.field_1724;
         if (var2 != null && var2.field_7512 instanceof class_1716 var3) {
            this.IiiillIlliiillIl = var3.field_7763;
            this.lliillIliliillIl = slot;
            this.IlIIilIlllIIilIl.clear();
            this.ilIIilIlIiIIilIl = 0;
            boolean[] var8 = new boolean[45];
            int var5 = 0;

            for (int var6 = 0; var6 < 9; var6++) {
               this.iiiillIlIIIIilIl[var6] = var3.method_7611(var6).method_7677().method_7972();
               this.lIIIilIliIIIilIl[var6] = -1;
            }

            for (int var9 = 0; var9 < 9; var9++) {
               if ((!this.lilillIliilillIl.Iilllilliill() || var9 != this.lliillIliliillIl) && !this.iiiillIlIIIIilIl[var9].method_7960()) {
                  int var7 = this.ilillIiill(var3, var8);
                  if (var7 >= 0) {
                     var8[var7] = true;
                     this.lIIIilIliIIIilIl[var9] = var7;
                     this.IlIIilIlllIIilIl.add(new int[]{0, var9, var7});
                  } else {
                     var5++;
                     this.IlIIilIlllIIilIl.add(new int[]{1, var9, 0});
                  }
               }
            }

            if (this.IlIIilIlllIIilIl.isEmpty()) {
               this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.iIliIiiiil;
               this.llIililIil(
                  IliIlllilIi<"IliIlllilIi","jcySCR7IQyBV2GSre73i3ZWfNgDGGYxJaMDsl8GjhRCa1jczbDbjGcBuTRXatw2m+cGFhTQfv+c4XUBQS3uFoGTDCE3EbMR6gsf0+8LPUqI51qsVEaZyfn+FkE4yOZp/Ik+VU7GORXnzEAl+TWgq/5I=">()
               );
            } else {
               this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.lIliIiiiil;
               if (var5 > 0) {
                  this.llIililIil(
                     IliIlllilIi<"IliIlllilIi","OPUVE4Dvo/GUoB21JO0NybBm5XwU4zFBioZ4uWAkSBQQ8TD3NuI1zHU5jiyS5WjaJyMbNBvs/0Xb0PA9yqO3bkFvN756JZsmdTI/cn+SJY7i7l1YDJA=">()
                        + var5
                        + IliIlllilIi<"IliIlllilIi","sAT7qeq2dk6o8ZdJdqCPqpQ0ZbtCVX7bCNKKez5fSR0bWLU8Cv1OAEWrSJUAKmRx7lqk8FWnS2wQneE+PK11rys4ZRpEG8aL74FUNhAXGILyrsiBO83inAuX">()
                  );
               }
            }
         }
      }
   }

   @Override
   protected void Iilililiiili() {
      this.IIIillIIil(false);
   }

   public boolean liIlliiIll() {
      return this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.iIliIiiiil && this.IIllllIlll();
   }

   @Override
   protected void iIIIlIlIIl() {
      if (this.IlIIilIlllIIilIl.isEmpty()) {
         this.iilllIIill();
      } else {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (var1 != null && Iiiilllliiilll.field_1761 != null && var1.field_7512 instanceof class_1716 && var1.field_7512.field_7763 == this.IiiillIlliiillIl) {
            boolean var2 = this.illillIlIilillIl.Iilllilliill() <= 0;

            while (!this.IlIIilIlllIIilIl.isEmpty()) {
               if (this.ilIIilIlIiIIilIl > 0) {
                  this.ilIIilIlIiIIilIl--;
                  return;
               }

               this.lIilliIill(var1, this.IlIIilIlllIIilIl.poll());
               this.ilIIilIlIiIIilIl = this.illillIlIilillIl.Iilllilliill();
               if (!var2) {
                  return;
               }
            }

            this.iilllIIill();
         } else {
            this.IIIillIIil(true);
         }
      }
   }

   public boolean ilIllIiIll() {
      return this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.IIliIiiiil && this.IIllllIlll();
   }

   public void Iillllilll() {
      long var2 = 1807640989502410261L;
      var2 ^= ((long)(this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.IIliIiiiil && this.lliillIliliillIl < 0 ? 0 : 1) << 32 ^ var2) & -1L << 32;
      this.iIIilIlIil();
      if ((int)(var2 >>> 32) != 0) {
         this.llIililIil(IliIlllilIi<"IliIlllilIi","CZZy2rc9p9W/o1QHBE0ZNh3I9xGigHhU0rYQV/DDud3jzAMU7/lnM/v9b7xOs/sO1Xa0TjBv">());
      }
   }

   private int liilliiill(class_1703 menu, class_1799 used, int want, boolean[] j) {
      int var5 = this.lIIIilIliIIIilIl[want];
      if (var5 >= 9 && var5 < 45 && !j[var5] && class_1799.method_7973(menu.method_7611(var5).method_7677(), used)) {
         return var5;
      } else {
         for (int var6 = 9; var6 < 45; var6++) {
            if (!j[var6] && class_1799.method_7973(menu.method_7611(var6).method_7677(), used)) {
               return var6;
            }
         }

         for (int var8 = 9; var8 < 45; var8++) {
            class_1799 var7 = menu.method_7611(var8).method_7677();
            if (!j[var8] && !var7.method_7960() && class_1799.method_31577(var7, used)) {
               return var8;
            }
         }

         return -1;
      }
   }

   private boolean IIllllIlll() {
      return Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_7512 instanceof class_1716;
   }

   private void llIililIil(String msg) {
      if (this.IIiillIllIiillIl.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }
   }

   private void lIilliIill(class_1657 p, int[] step) {
      class_1703 var3 = p.field_7512;
      if (step[0] == 1) {
         this.Ilillllill(p, step[1], 0, class_1713.field_7794);
      } else {
         this.Ilillllill(p, step[1], 0, class_1713.field_7790);
         if (!var3.method_34255().method_7960()) {
            this.Ilillllill(p, step[2], 0, class_1713.field_7790);
         }

         if (!var3.method_34255().method_7960()) {
            this.Ilillllill(p, step[1], 0, class_1713.field_7790);
         }
      }
   }

   public int lIIlliIIll() {
      return this.lliillIliliillIl;
   }

   public int IlIllllIll() {
      return this.IlIIilIlllIIilIl.size();
   }

   private void IIIillIIil(boolean warn) {
      long var3 = 99281824806123258L;
      var3 ^= ((long)(this.iIiillIlIliillIl != ilIiiIIiIiIiiIIi.IIliIiiiil ? 1 : 0) << 32 ^ var3) & -1L << 32;
      this.iIIilIlIil();
      if (warn && (int)(var3 >>> 32) != 0) {
         this.llIililIil(
            IliIlllilIi<"IliIlllilIi","V+4NgO+nkay3kmmddhN/99D5sjQeXgFJSCGSBfyZnNP2mSdpcNYH+f0NVyMEs55/ZC3Ihb1FMUkVHxUNc2IaNuUuKEOANYlvxpFB+7NbG1UwrerNvY4BaFmqpuP4">()
         );
      }
   }

   private int ilillIiill(class_1703 menu, boolean[] reserved) {
      for (int var3 = 9; var3 < 45; var3++) {
         if (!reserved[var3] && menu.method_7611(var3).method_7677().method_7960()) {
            return var3;
         }
      }

      return -1;
   }

   private void iilllIIill() {
      if (this.IlIIilIlllIIilIl.isEmpty()) {
         if (this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.lIliIiiiil) {
            this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.iIliIiiiil;
            this.llIililIil(
               IliIlllilIi<"IliIlllilIi","mcz+zaSP1G5dNkpz6j8kLbkspbw+/1dnArrAdAvqpb9iFAtxhyX1zzvVzOgV/rHzwTKhIhzMCQBX1RUJSBleDU+/cpA0L9DHBEx+1mLh">()
                  + (this.lliillIliliillIl + 1)
                  + IliIlllilIi<"IliIlllilIi","OMso4rGf8R93+XtXX8AWDWWE0NvJXwgornycrIQpuq0bDGTZ0tXiaQOqddWc8GiMD+FNzto9vQ9Ru6PGUVGgMzy9yg==">()
            );
         } else if (this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.IlliIiiiil) {
            this.llIililIil(
               IliIlllilIi<"IliIlllilIi","V7ePFsZ0PNZ2m0pXMn7aJTJxL5pFmqWpgRxpt7tzWC55PLrRSsXKKEg3cNrgXHgg+6CoSRBbYh2XAWzGYm1NsAcYSmcQdCFfx8GZMg9tc4+4">()
                  + (this.lliillIliliillIl + 1)
                  + IliIlllilIi<"IliIlllilIi","4v3P32DYq3uZVwUqAuFrvOlHxPti3cu8SYaWYrVmuc62i/9n7kxMrKE=">()
            );
            this.iIIilIlIil();
         }
      }
   }

   public ilIiiIIiIiIiiIIi iiiIlIIIll() {
      return this.iIiillIlIliillIl;
   }

   public iIliiIllii() {
      super(IliIlllilIi<"IliIlllilIi","lC9i5g5YqrNrJ+pD5cRWN22Yjkiw43jjRayPUSNjKJeGu/EZvwG8UXeG">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lilillIliilillIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","cb9y+f/MtlxZS5g/X9a9qmsCpXF0N/gU8xx3SU1kOchO5ZRQqGeQ2CiKLg==">(),
         IliIlllilIi<"IliIlllilIi","mz4hq1o89Pe1dRrYS9X5gGhfIqkj6cM9JcbSOD0ImDwCdTnKjy3x+bwaggFALt8+hS+U0clY8jKF8Lm4IS2TfUXzwDkWUvC7PMBIiEkLk2Ohy/jBJ07nwqWg3xj6D34ZbsugULGWfS5o/BJC6oYBskb0tvbGiyTK9o4R4C8=">(),
         true
      );
      this.IIiillIllIiillIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","/2aAana1EqttFDQjt6Ev9T37WMpEWPI/lk9bUHnFLDddT25KAE8q+bg=">(),
         IliIlllilIi<"IliIlllilIi","NSfwFVLyyWCbeH8y1Xgq5jmeDoSm/N03vIzDdyrw0CIW1O9hGqHhEGWbcf6biylB4iv4OJCI02Y158e4hlSlFMTQpg==">(),
         true
      );
      this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.IIliIiiiil;
      this.lliillIliliillIl = -1;
      this.IiiillIlliiillIl = -1;
      this.iiiillIlIIIIilIl = new class_1799[9];
      this.lIIIilIliIIIilIl = new int[9];
      this.IlIIilIlllIIilIl = new ArrayDeque<>();
      this.ilIIilIlIiIIilIl = 0;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illillIlIilillIl, this.lilillIliilillIl, this.IIiillIllIiillIl});
   }
}
