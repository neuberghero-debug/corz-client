package gg.corz;

import java.util.Arrays;

public class lIiIIIIiiIiIIIIi extends ilIllIiIll {
   private final iiIiiilIIliiil IIiiiiIiil;
   private double lliiiiIiil;
   private final lIilliiiIillii lIiiiiIiil;
   private final lliliIIiililiIIi iiliiiIiil;
   private static final int IiliiiIiil = 60;
   private final boolean[] iIiiiiIiil;
   private int iliiiiIiil;
   private int IliiiiIiil;
   private final IIIIlilllIIIlill liliiiIiil = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","OadiUDDyYYML4VSFhzXtEQxexfE0npfIaNYMuIrDesIwlQ==">(),
      IliIlllilIi<"IliIlllilIi","3LR5ORfVnX1awBdzQif6r2LBdqeOxQSmTFbfAsVmwVIU/7wXmCKFqSAXGqeV1Wg993C0XR6TGg==">(),
      0.6,
      0.05,
      1.0,
      0.05
   );
   private int IiiiiiIiil;
   private static final int illiiiIiil = 4;

   @Override
   protected void Illillliilli() {
      this.IliiiiIiil = this.lIIlliIIll();
      this.lliiiiIiil = this.liliiiIiil.Iilllilliill();
      this.iliiiiIiil = -1;
      Arrays.fill(this.iIiiiiIiil, false);
      this.lIiiiiIiil.IliIlllilIi(this.IliiiiIiil);
   }

   public lIiIIIIiiIiIIIIi() {
      super(IliIlllilIi<"IliIlllilIi","kzVnhC87jvIXC9/RFEE2tbNDhiNmG+kfrwqwwknm9+YtIeq9z7jZ">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.iiliiiIiil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","zm1bcxEq96pZS9O71+z4KOWjMYr/XpuaJM2cBYCYaHlz">(),
         IliIlllilIi<"IliIlllilIi","mc0KK/UvIcYIHy54bv3fqz10wrjKgz3WvaH1kgM0gHw1ETv7LERH+NNJMvfAQcaQ8WgTB9kzRbnCFdGL2pbqW0L+2aDq2/lR4RuIuxhsmr3hlWdyBHMK40L1j4FfyWoOpLCO3IGgfNEhULUhvRTsoRy6tbV6hlTlPbnCj5Cd9pjpS7j8rRWq9bjfYCa0cHyrjZ6KQwtpHbpTdoKHi/TmDAFAQVGa3w==">(),
         IliIlllilIi<"IliIlllilIi","rDv8jukHuh6B4HanorvXypF21n54rIw22i1qUTRM4p/fN41w">(),
         IiIlIlilliIlIlil.iillIIiIil
      );
      this.IIiiiiIiil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","6mPe6lknBmTUjKjrxVY/DmcHcmKxZiyt3IdEPUf4R2hhb9g=">(),
         IliIlllilIi<"IliIlllilIi","o2F1ycAvp1M3bqZpPRui2OB+UHsnbvdsgV6za1SgECGAExF3zIrEglqXLiF3GRnjOKLERCvDYCLRiov5dWnJ6NAE/Bi7xMeBZeiTQKzsQxyzGrwjMfo9E/yRnowRtsnNaIem/EHMPHYPFHTtVzp94a6OxkOXrMveTA==">(),
         false
      );
      this.lIiiiiIiil = new lIilliiiIillii();
      this.iIiiiiIiil = new boolean[349];
      this.IliiiiIiil = -1;
      this.lliiiiIiil = -1.0;
      this.iliiiiIiil = -1;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liliiiIiil, this.iiliiiIiil, this.IIiiiiIiil});
   }

   public static void iiiIlIIIll() {
      try {
         if (llilIllililIll.iliIiiliiiii(lIiIIIIiiIiIIIIi.class) instanceof lIiIIIIiiIiIIIIi var0) {
            var0.lIiiiiIiil.lIiiIiIlilli();
         }
      } catch (Throwable var2) {
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      int var1 = this.lIIlliIIll();
      if (var1 != this.IliiiiIiil) {
         this.IliiiiIiil = var1;
         this.lIiiiiIiil.IliIlllilIi(var1);
         this.iliiiiIiil = 4;
         this.IiiiiiIiil = 0;
      }

      if (this.liliiiIiil.Iilllilliill() != this.lliiiiIiil) {
         this.lliiiiIiil = this.liliiiIiil.Iilllilliill();
         this.iliiiiIiil = 4;
         this.IiiiiiIiil = 0;
      }

      this.lIiiiiIiil.iIlIlllllill();
      if (this.iliiiiIiil >= 0) {
         if (this.iliiiiIiil > 0) {
            this.iliiiiIiil--;
         } else {
            if (this.lIiiiiIiil.liiiIIllIl(var1)) {
               this.lIiiiiIiil.IilliliilIIi(30, false, (float)this.liliiiIiil.Iilllilliill());
               this.iliiiiIiil = -1;
            } else if (++this.IiiiiiIiil > 60) {
               this.iliiiiIiil = -1;
            }
         }
      }
   }

   private int lIIlliIIll() {
      return IiIlIlilliIlIlil.IliIlllilIi(this.iiliiiIiil.Iilllilliill());
   }

   @Override
   protected void Iilililiiili() {
      this.lIiiiiIiil.lIiiIiIlilli();
      this.iliiiiIiil = -1;
      Arrays.fill(this.iIiiiiIiil, false);
   }

   @Override
   protected void lilIliilIl(IiiIlllliiIlll event) {
      long var6 = -6285610644737281997L;
      long var8 = 8730186005714881991L;
      var6 ^= ((long)event.IliIlllilIi() << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)event.liiiIIllIl() ^ var6) & -1L >>> 32;
      var8 ^= ((long)((int)(var6 >>> 32) >= 0 && (int)(var6 >>> 32) < this.iIiiiiIiil.length ? 1 : 0) << 32 ^ var8) & -1L << 32;
      if ((int)var6 == 0) {
         if ((int)(var8 >>> 32) != 0 && this.iIiiiiIiil[(int)(var6 >>> 32)]) {
            this.iIiiiiIiil[(int)(var6 >>> 32)] = false;
            this.lIiiiiIiil.IilliliilIIi(illiilIiliil.iliIiiliiiii((int)(var6 >>> 32)), true, (float)this.liliiiIiil.Iilllilliill());
         }
      } else if ((int)var6 == (-492809068 * -33 ^ -917169939)) {
         if ((int)(var8 >>> 32) == 0 || !this.iIiiiiIiil[(int)(var6 >>> 32)]) {
            if (Iiiilllliiilll.field_1755 != null || this.IIiiiiIiil.Iilllilliill()) {
               var8 ^= ((long)this.lIIlliIIll() ^ var8) & -1L >>> 32;
               if ((int)var8 != this.IliiiiIiil) {
                  this.IliiiiIiil = (int)var8;
                  this.lIiiiiIiil.IliIlllilIi((int)var8);
               }

               if ((int)(var8 >>> 32) != 0) {
                  this.iIiiiiIiil[(int)(var6 >>> 32)] = true;
               }

               this.lIiiiiIiil.IilliliilIIi(illiilIiliil.iliIiiliiiii((int)(var6 >>> 32)), false, (float)this.liliiiIiil.Iilllilliill());
            }
         }
      }
   }
}
