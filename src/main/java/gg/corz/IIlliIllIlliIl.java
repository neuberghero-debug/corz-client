package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;

public class IIlliIllIlliIl extends ilIllIiIll {
   private float lIliIlilliIliIlill;
   private final iiIiiilIIliiil llIiIlillilIiIlill;
   private final iiIiiilIIliiil IiIiIlillliIiIlill;
   private final iiIiiilIIliiil iIIiIlillIlIiIlill;
   private final IIIIlilllIIIlill liilIlilliiilIlill;
   private int IlliIlillllliIlill;
   private final iiIiiilIIliiil ililIlillIiilIlill = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","VoOuM6mzPCIhgH/+CBoAOvyjanBHgq4Z3XYnF2CVaA9Fye+Jug==">(),
      IliIlllilIi<"IliIlllilIi","VQ7es8Zismoo9F2tfEwQ8Sv73LQ/XTNuqLh5+EU6tpW3xWC+sCFBd8JY/+l7PGIdu1JjEZvHv1wVw0FnCgOqBkOSaUO7">(),
      true
   );
   private final iiIiiilIIliiil IIIiIlilllIIiIlill;
   private final iilliIlIIiliIl iiIiIlillIIliIlill;
   private class_2338 liliIlilliiliIlill;
   private class_2350 illiIlillIiliIlill;

   private void iiiIlIIIll() {
      class_2350 var1 = class_2350.method_10150((double)this.lIliIlilliIliIlill);
      if (this.liliIlilliiliIlill != null) {
         class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(this.liliIlilliiliIlill);
         if (this.lIIlliIIll(var2, this.liliIlilliiliIlill)) {
            Iiiilllliiilll.field_1761.method_2902(this.liliIlilliiliIlill, var1.method_10153());
            Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
            return;
         }

         this.liliIlilliiliIlill = null;
      }

      class_2338 var3 = Iiiilllliiilll.field_1724.method_24515().method_10093(var1);
      if (this.lIIlliIIll(Iiiilllliiilll.field_1687.method_8320(var3), var3)) {
         this.liliIlilliiliIlill = var3;
         Iiiilllliiilll.field_1761.method_2910(this.liliIlilliiliIlill, var1.method_10153());
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      }
   }

   private boolean ilIllIiIll(class_2338 pos) {
      class_2248 var2 = Iiiilllliiilll.field_1687.method_8320(pos).method_26204();
      return var2 == class_2246.field_10164 || var2 == class_2246.field_10036 || var2 == class_2246.field_22089;
   }

   private class_2350 IlIllllIll() {
      class_2338 var1 = Iiiilllliiilll.field_1724.method_24515();
      class_2350 var2 = class_2350.method_10150((double)this.lIliIlilliIliIlill);
      int var3 = this.iiIiIlillIIliIlill.Iilllilliill();

      for (int var4 = 1; var4 <= var3; var4++) {
         class_2338 var5 = var1.method_10079(var2, var4);

         for (int var6 = -1; var6 <= 2; var6++) {
            if (this.ilIllIiIll(var5.method_10086(var6))) {
               return var2;
            }
         }

         class_2350 var9 = var2.method_10160();
         class_2350 var7 = var2.method_10170();

         for (int var8 = -1; var8 <= 2; var8++) {
            if (this.ilIllIiIll(var5.method_10093(var9).method_10086(var8))) {
               return var2;
            }

            if (this.ilIllIiIll(var5.method_10093(var7).method_10086(var8))) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   protected void Illillliilli() {
      if (Iiiilllliiilll.field_1724 != null) {
         this.lIliIlilliIliIlill = Iiiilllliiilll.field_1724.method_36454();
      }

      this.IlliIlillllliIlill = 0;
      this.illiIlillIiliIlill = null;
      this.liliIlilliiliIlill = null;
   }

   @Override
   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1690.field_1894.method_23481(false);
         Iiiilllliiilll.field_1690.field_1913.method_23481(false);
         Iiiilllliiilll.field_1690.field_1849.method_23481(false);
         Iiiilllliiilll.field_1690.field_1886.method_23481(false);
      }

      this.IlliIlillllliIlill = 0;
      this.illiIlillIiliIlill = null;
   }

   private void Iillllilll() {
      Iiiilllliiilll.field_1690.field_1913.method_23481(false);
      Iiiilllliiilll.field_1690.field_1849.method_23481(false);
   }

   private int iIlllIllll(class_2338 origin, class_2350 side) {
      int var3 = 0;
      class_2350 var4 = class_2350.method_10150((double)this.lIliIlilliIliIlill);

      for (int var5 = 0; var5 <= this.iiIiIlillIIliIlill.Iilllilliill(); var5++) {
         class_2338 var6 = origin.method_10079(var4, var5).method_10079(side, 2);

         for (int var7 = -1; var7 <= 2; var7++) {
            if (this.ilIllIiIll(var6.method_10086(var7))) {
               var3++;
            }
         }
      }

      return var3;
   }

   private class_2350 IIllllIlll() {
      long var7 = -4512500839653742985L;
      class_2338 var1 = Iiiilllliiilll.field_1724.method_24515();
      class_2350 var2 = class_2350.method_10150((double)this.lIliIlilliIliIlill);
      class_2350 var3 = var2.method_10160();
      class_2350 var4 = var2.method_10170();
      var7 ^= ((long)this.iIlllIllll(var1, var3) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)this.iIlllIllll(var1, var4) ^ var7) & -1L >>> 32;
      return (int)(var7 >>> 32) <= (int)var7 ? var3 : var4;
   }

   public IIlliIllIlliIl() {
      super(IliIlllilIi<"IliIlllilIi","McYLFFgz6Wmo5WklMjtUznRHkvfmEb7kaNHjao2rRF8Q2hQs">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.liilIlilliiilIlill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","JyAMEYGCKRtoNGFBFV5mTT/hF4e7Pf8G8E8lChi8cKFs">(),
         IliIlllilIi<"IliIlllilIi","oYl91WLocohBOgPSPAygNLOY/UPrPWwVkvds0IQj10z6OMgoSD9hQWlH2XSlUblUd0XPC3cL">(),
         0.0,
         -90.0,
         90.0,
         1.0
      );
      this.IIIiIlilllIIiIlill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","1F0/lhsm4z2sc3jeIqUs5kCEw6/DNNFdnqhoqgBIKNc0oQg=">(),
         IliIlllilIi<"IliIlllilIi","BXX2rJyhQQYUmZgTgUvO+Ab6RlzyO4eg85fL0AbUR+hTPMNw1FfRVZo/AmI1KCjtSSEjq/YVIQNdamhBeyZYE5JSq8GRz3W6bERq">(),
         true
      );
      this.iIIiIlillIlIiIlill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","2Ao2wEQ/aL3qxyUs9WDcBiF4IA+eIiLZDutfZHa8PooVkJw4qUqc">(),
         IliIlllilIi<"IliIlllilIi","fgoQ5RTHetbqW5nMigSyH8wxDP3dvXct1SmvTYLS+XDEVEX0lIcc2onsG7uBRJpnjZiN1nMn+H/hhI09F0oMgYen">(),
         true
      );
      this.llIiIlillilIiIlill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","R8Fm8VnmisYnrS3c6tXKGhJ7rxk1hZNp/cVZmDyDog2rKecKUQ==">(),
         IliIlllilIi<"IliIlllilIi","UfOH9y7OdLi7vPUJ7SD8Hm4XVC+h6wTwBWHPEle5dw1gQBUYK7XwwCcBo2pLOa8ywNJkwJGtM0/Y5/8izA==">(),
         true
      );
      this.IiIiIlillliIiIlill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Vp5J4n1Bt8dVjb7xSCOB9KvpxmXjuiZ6iCOzE9rL8gKLNjbl6g==">(),
         IliIlllilIi<"IliIlllilIi","Oh4x7K7hplDdzR3rUavu5AWUm8kVDTOy/gBZzU+0hGmcgK3/soCKyufie3/s9y27VGcMELqPF0ow+ZK9ZXl0bmJZXEEs">(),
         true
      );
      this.iiIiIlillIIliIlill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","m5GbOeQbYtbdfu5dsmRNSRkKdWD5e9/e18pBRffRawlL5Z0IGQ==">(),
         IliIlllilIi<"IliIlllilIi","Ht2CZu8sssnX0BfEuaQpRuNvVY9qoGJyn4NCwpCCea4DJ5l/r/Os79uKCLftV7bvvrFzDqI/42q+R7wFX/MIzU78/oKk">(),
         4,
         1,
         8
      );
      this.lIliIlilliIliIlill = 0.0F;
      this.IlliIlillllliIlill = 0;
      this.illiIlillIiliIlill = null;
      this.liliIlilliiliIlill = null;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.ililIlillIiilIlill,
            this.liilIlilliiilIlill,
            this.IIIiIlilllIIiIlill,
            this.iIIiIlillIlIiIlill,
            this.llIiIlillilIiIlill,
            this.IiIiIlillliIiIlill,
            this.iiIiIlillIIliIlill
         }
      );
   }

   private boolean lIIlliIIll(class_2680 state, class_2338 pos) {
      return !state.method_26215() && !this.liIlliiIll(state) && state.method_26214(Iiiilllliiilll.field_1687, pos) >= 0.0F;
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         if (this.ililIlillIiilIlill.Iilllilliill()) {
            Iiiilllliiilll.field_1724.method_36457((float)this.liilIlilliiilIlill.Iilllilliill());
         }

         if (this.IIIiIlilllIIiIlill.Iilllilliill()) {
            Iiiilllliiilll.field_1724.method_36456(this.lIliIlilliIliIlill);
         }

         if (this.IiIiIlillliIiIlill.Iilllilliill()) {
            if (this.IlliIlillllliIlill > 0) {
               this.lllllillll();
               return;
            }

            class_2350 var1 = this.IlIllllIll();
            if (var1 != null) {
               this.illiIlillIiliIlill = this.IIllllIlll();
               this.IlliIlillllliIlill = 8;
               this.lllllillll();
               return;
            }
         }

         this.Iillllilll();
         if (this.llIiIlillilIiIlill.Iilllilliill()) {
            Iiiilllliiilll.field_1690.field_1886.method_23481(true);
         }

         if (this.iIIiIlillIlIiIlill.Iilllilliill()) {
            Iiiilllliiilll.field_1690.field_1894.method_23481(true);
         }
      }
   }

   private void lllllillll() {
      this.IlliIlillllliIlill--;
      if (this.ililIlillIiilIlill.Iilllilliill()) {
         Iiiilllliiilll.field_1724.method_36457((float)this.liilIlilliiilIlill.Iilllilliill());
      }

      if (this.IIIiIlilllIIiIlill.Iilllilliill()) {
         Iiiilllliiilll.field_1724.method_36456(this.lIliIlilliIliIlill);
      }

      class_2350 var1 = class_2350.method_10150((double)this.lIliIlilliIliIlill);
      class_2350 var2 = var1.method_10160();
      if (this.illiIlillIiliIlill == var2) {
         Iiiilllliiilll.field_1690.field_1913.method_23481(true);
         Iiiilllliiilll.field_1690.field_1849.method_23481(false);
      } else {
         Iiiilllliiilll.field_1690.field_1849.method_23481(true);
         Iiiilllliiilll.field_1690.field_1913.method_23481(false);
      }

      if (this.iIIiIlillIlIiIlill.Iilllilliill()) {
         Iiiilllliiilll.field_1690.field_1894.method_23481(true);
      }

      if (this.llIiIlillilIiIlill.Iilllilliill()) {
         Iiiilllliiilll.field_1690.field_1886.method_23481(true);
      }

      if (this.IlliIlillllliIlill <= 0) {
         this.Iillllilll();
         this.illiIlillIiliIlill = null;
      }
   }

   private boolean liIlliiIll(class_2680 state) {
      class_2248 var2 = state.method_26204();
      return var2 == class_2246.field_10382 || var2 == class_2246.field_10164;
   }
}
