package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ililIiIlIiilIiIl {
   private final String illiIliIll;
   private final List<ilIIililIiIIilil> iIiiIliIll;
   private final List<ilIIililIiIIilil> IliiIliIll;
   private int IiliIliIll;
   private final int[] lIiiIliIll;
   private final int[] IIiiIliIll;
   private final int[] iiliIliIll;
   private final byte[] liliIliIll = new byte[(1402725193 ^ 15) + 63 ^ 1402725261];

   public ililIiIlIiilIiIl recolor(int argb, int classes) {
      for (int var3 = 0; var3 < 8; var3++) {
         if ((argb & IlIliIlllIliIl.IliIlllilIi(var3)) != 0) {
            this.liliIliIll[var3] = 1;
            this.iiliIliIll[var3] = 0xFF000000 | classes;
            this.IIiiIliIll[var3] = -1;
         }
      }

      return this;
   }

   public ililIiIlIiilIiIl glow(int classes, lilIiiiliilIiiil p) {
      int var3 = this.IliiIliIll.size();
      this.IliiIliIll.add(new ilIIililIiIIilil(classes & IlIliIlllIliIl.lIIiiIilliIIiiIill, p));

      for (int var4 = 0; var4 < 8; var4++) {
         if ((classes & IlIliIlllIliIl.IliIlllilIi(var4)) != 0) {
            this.lIiiIliIll[var4] = p == null ? -1 : var3;
         }
      }

      return this;
   }

   public ililIiIlIiilIiIl paint(int classes, lilIiiiliilIiiil p) {
      if (p == null) {
         throw new IllegalArgumentException(IliIlllilIi<"IliIlllilIi","r0fYf1oYkpCCliylkOb+EiQ7r1FmmvnHWBf9wbxwwKEAHg8=">());
      } else {
         int var3 = this.iIiiIliIll.size();
         this.iIiiIliIll.add(new ilIIililIiIIilil(classes & IlIliIlllIliIl.lIIiiIilliIIiiIill, p));

         for (int var4 = 0; var4 < 8; var4++) {
            if ((classes & IlIliIlllIliIl.IliIlllilIi(var4)) != 0) {
               this.liliIliIll[var4] = 2;
               this.IIiiIliIll[var4] = var3;
            }
         }

         return this;
      }
   }

   private static ilIIililIiIIilil[] compact(List<ilIIililIiIIilil> map, int[] in) {
      ArrayList var2 = new ArrayList();
      int[] var3 = new int[map.size()];
      Arrays.fill(var3, -1);

      for (int var4 = 0; var4 < 8; var4++) {
         int var5 = in[var4];
         if (var5 >= 0) {
            if (var3[var5] < 0) {
               var3[var5] = var2.size();
               var2.add(new ilIIililIiIIilil(0, ((ilIIililIiIIilil)map.get(var5)).liiiIIllIl()));
            }

            in[var4] = var3[var5];
         }
      }

      for (int var6 = 0; var6 < 8; var6++) {
         if (in[var6] >= 0) {
            ilIIililIiIIilil var7 = (ilIIililIiIIilil)var2.get(in[var6]);
            var2.set(in[var6], new ilIIililIiIIilil(var7.IliIlllilIi() | IlIliIlllIliIl.IliIlllilIi(var6), var7.liiiIIllIl()));
         }
      }

      return var2.toArray(new ilIIililIiIIilil[0]);
   }

   private ililIiIlIiilIiIl(String name) {
      this.iiliIliIll = new int[-(153318808 * -115) ^ 451793728];
      this.IIiiIliIll = new int[((-1696614433 * 81 << 7 | -1696614433 * 81 >>> 25) + 73) * -79 ^ -176662287];
      this.lIiiIliIll = new int[-201902922 - 1 + 109 ^ -201902806];
      this.iIiiIliIll = new ArrayList<>();
      this.IliiIliIll = new ArrayList<>();
      if (name != null && !name.isBlank()) {
         this.illiIliIll = name;
         this.IiliIliIll = name.hashCode() * ((2102047455 + -93 - -3 >>> 25 | 2102047455 + -93 - -3 << 7) ^ 997079823);
         Arrays.fill(this.IIiiIliIll, -1);
         Arrays.fill(this.lIiiIliIll, -1);
      } else {
         throw new IllegalArgumentException(IliIlllilIi<"IliIlllilIi","Rb+bKsIUrkSIuPKEBpMedvm0m3gwshWT/iLxiiN19CfvHpxsTzHQ">());
      }
   }

   public ililIiIlIiilIiIl seed(int seed) {
      this.IiliIliIll = seed;
      return this;
   }

   public ililIiIlIiilIiIl keep(int classes) {
      for (int var2 = 0; var2 < 8; var2++) {
         if ((classes & IlIliIlllIliIl.IliIlllilIi(var2)) != 0) {
            this.liliIliIll[var2] = 0;
            this.IIiiIliIll[var2] = -1;
         }
      }

      return this;
   }

   public lIIllIiiIIllIi build() {
      int[] var1 = (int[])this.IIiiIliIll.clone();
      int[] var2 = (int[])this.lIiiIliIll.clone();
      return new lIIllIiiIIllIi(
         this.illiIliIll,
         this.IiliIliIll,
         (byte[])this.liliIliIll.clone(),
         (int[])this.iiliIliIll.clone(),
         var1,
         var2,
         compact(this.iIiiIliIll, var1),
         compact(this.IliiIliIll, var2)
      );
   }
}
