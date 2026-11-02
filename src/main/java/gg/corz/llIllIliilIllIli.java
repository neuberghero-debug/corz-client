package gg.corz;

import java.util.List;
import net.minecraft.class_2960;
import net.minecraft.class_3532;

final class llIllIliilIllIli {
   final llIllIliilIllIli iiliIIllIi;
   float iilIlIllIi;
   float illIlIllIi;
   float[] ilIIlIllIi;
   float[] IiIIlIllIi;
   float lliIlIllIi;
   float llIllIllIi;
   float liIIlIllIi;
   boolean iiIIlIllIi;
   float lilIlIllIi;
   float iIiIlIllIi;
   final int IlliIIllIi;
   final String iIliIIllIi;
   boolean lIlIlIllIi;
   float lIIllIllIi;
   String liiiIIllIi;
   iiIiiilIIliiil lliiIIllIi;
   final String liliIIllIi;
   String iiiiIIllIi;
   float ilIllIllIi;
   float IlIllIllIi;
   final String illiIIllIi;
   ilIllIiIll IliiIIllIi;
   float IliIlIllIi;
   float IIIllIllIi;
   lliliIIiililiIIi IiiiIIllIi;
   float IIiIlIllIi;
   class_2960 lIIIlIllIi;
   boolean IIlIlIllIi;
   float lllIlIllIi;
   final Class<? extends ilIllIiIll> IiliIIllIi;
   float lIiIlIllIi;
   final String lIliIIllIi;
   int iIIIlIllIi;
   lliliIIiililiIIi iliiIIllIi;
   boolean iIlIlIllIi;
   float iiiIlIllIi;
   String[] llIIlIllIi;
   float liiIlIllIi;
   final boolean IIiiIIllIi;
   final int llliIIllIi;
   float iIIllIllIi;
   boolean iIiiIIllIi;
   float IilIlIllIi;
   float iliIlIllIi;
   boolean IllIlIllIi;
   float IIIIlIllIi = -1.0F;
   float IiiIlIllIi;
   String lIiiIIllIi;
   int[] IlIIlIllIi;

   void Iilllilliill(int z) {
      if (this.IiiiIIllIi != null && z >= 0) {
         if (!llIlIiiilIlIii.IiilIilIIl[z].equalsIgnoreCase(this.IiiiIIllIi.Iilllilliill())) {
            this.IiiiIIllIi.IIillIiliIil(llIlIiiilIlIii.IiilIilIIl[z]);
         }
      }
   }

   float IlIillIiilIi() {
      return 16.0F + this.Ililllililil() * 0.82F + 2.0F + 12.0F;
   }

   boolean IilliliilIIi() {
      if (!this.liiiIIllIl()) {
         return false;
      } else {
         return this.iiliIIllIi == null ? !this.IliiIIllIi.IliIlllilIi() : this.iiliIIllIi.iIlIlllllill() && !this.lliiIIllIi.Iilllilliill();
      }
   }

   class_2960 IIIllIIliIIl() {
      if (this.lIIIlIllIi == null) {
         this.lIIIlIllIi = switch (this.IlliIIllIi) {
            case 1 -> lIlIIiliIlIIil.IllIllllIl(this.illiIIllIi);
            case 2 -> lIlIIiliIlIIil.Iilililiiili();
            case 3 -> lIlIIiliIlIIil.illIlIilIl(this.illiIIllIi);
            default -> lIlIIiliIlIIil.IIIIllIIIl(this.illiIIllIi);
         };
      }

      return this.lIIIlIllIi;
   }

   String IIillIiliIil() {
      if (this.IiiiIIllIi == null) {
         return this.IiIlliIliiIl();
      } else {
         String var1 = this.IiiiIIllIi.Iilllilliill();
         if (!var1.equals(this.liiiIIllIi)) {
            this.liiiIIllIi = var1;
            this.iiiiIIllIi = this.lIliIIllIi + Illillliilli<"Illillliilli","Y7m86qVjB43+ugymX+Fp9DtY9M3tJWujeEmsgHqZ">() + var1;
            this.IIIIlIllIi = -1.0F;
         }

         return this.iiiiIIllIi;
      }
   }

   float IlIlllIlilIl() {
      if (this.liIIlIllIi < 0.0F) {
         this.liIIlIllIi = llilliilililliil.llIIlilIIl(this.lIliIIllIi);
      }

      return this.liIIlIllIi;
   }

   int iliIiiliiiii() {
      return this.IIiiIIllIi && this.iIIIlIllIi > 0 ? class_3532.method_15340(this.iliiIIllIi.Ililllililil(), 0, this.iIIIlIllIi - 1) : 0;
   }

   float Ililllililil() {
      if (this.IiiiIIllIi == null) {
         return this.Iiilliiliiil();
      } else {
         String var1 = this.IIillIiliIil();
         if (this.IIIIlIllIi < 0.0F) {
            this.IIIIlIllIi = llilliilililliil.llIIlilIIl(var1);
         }

         return this.IIIIlIllIi;
      }
   }

   int Illlllllilll() {
      long var3 = 3745661996240696201L;
      if (this.IiiiIIllIi == null) {
         return -1;
      } else {
         String var1 = this.IiiiIIllIi.Iilllilliill();

         for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < llIlIiiilIlIii.IiilIilIIl.length; var5 += 4294967296L) {
            if (llIlIiiilIlIii.IiilIilIIl[(int)(var5 >>> 32)].equalsIgnoreCase(var1)) {
               return (int)(var5 >>> 32);
            }
         }

         return 0;
      }
   }

   boolean iIlIlllllill() {
      if (!this.liiiIIllIl()) {
         return false;
      } else {
         return this.iiliIIllIi == null ? this.IliiIIllIi.IliIlllilIi() : this.iiliIIllIi.iIlIlllllill() && this.lliiIIllIi.Iilllilliill();
      }
   }

   String IiIlliIliiIl() {
      return this.IIiiIIllIi && this.iIIIlIllIi > 0 ? this.llIIlIllIi[this.iliIiiliiiii()] : this.lIliIIllIi;
   }

   llIllIliilIllIli IIlilIliiIli() {
      for (llIllIliilIllIli var1 = this; var1 != null; var1 = var1.iiliIIllIi) {
         if (var1.IIlllIlliIll()) {
            return var1;
         }
      }

      return null;
   }

   float IIIilIIiiIIi() {
      return this.IIiiIIllIi ? 43.0F : 24.0F;
   }

   llIllIliilIllIli IiIiliIiiiIi(String settingName) {
      this.lIiiIIllIi = settingName;
      return this;
   }

   void IliIlllilIi() {
      long var5 = -1303580915273278350L;
      if (!this.iIiiIIllIi) {
         this.iIiiIIllIi = true;
         this.IliiIIllIi = llilIllililIll.iliIiiliiiii(this.IiliIIllIi);
         if (this.IliiIIllIi != null) {
            for (IilliIllilliIl var2 : this.IliiIIllIi.IiIlliIliiIl()) {
               if (this.liliIIllIi != null && var2 instanceof iiIiiilIIliiil var3 && var2.IliIlllilIi().equalsIgnoreCase(this.liliIIllIi)) {
                  this.lliiIIllIi = var3;
               }

               if (this.IIiiIIllIi
                  && var2 instanceof lliliIIiililiIIi var8
                  && var2.IliIlllilIi().equalsIgnoreCase(Illillliilli<"Illillliilli","so0rStaBAFCekheZl/LEsfWtjBmrRXePg1ZhGwgRd0M=">())) {
                  this.iliiIIllIi = var8;
               }

               if (this.lIiiIIllIi != null && var2 instanceof lliliIIiililiIIi var9 && var2.IliIlllilIi().equalsIgnoreCase(this.lIiiIIllIi)) {
                  this.IiiiIIllIi = var9;
               }
            }

            if (this.iliiIIllIi != null) {
               List var7 = this.iliiIIllIi.IiIiliIiiiIi();
               this.iIIIlIllIi = var7.size();
               this.IlIIlIllIi = new int[this.iIIIlIllIi];
               this.llIIlIllIi = new String[this.iIIIlIllIi];
               this.ilIIlIllIi = new float[this.iIIIlIllIi];
               this.IiIIlIllIi = new float[this.iIIIlIllIi];
               var5 ^= (0L ^ var5) & -1L << 32;

               while ((int)(var5 >>> 32) < this.iIIIlIllIi) {
                  String var10 = (String)var7.get((int)(var5 >>> 32));
                  this.IlIIlIllIi[(int)(var5 >>> 32)] = 2;
                  this.llIIlIllIi[(int)(var5 >>> 32)] = var10;
                  this.ilIIlIllIi[(int)(var5 >>> 32)] = -1.0F;

                  for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < llIlIiiilIlIii.iiliIilIIl.length; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
                     if (llIlIiiilIlIii.iiliIilIIl[(int)var5].equalsIgnoreCase(var10)) {
                        this.IlIIlIllIi[(int)(var5 >>> 32)] = (int)var5;
                        this.llIIlIllIi[(int)(var5 >>> 32)] = llIlIiiilIlIii.IIiiIilIIl[(int)var5];
                     }
                  }

                  var5 += 4294967296L;
               }
            }
         }
      }
   }

   boolean liiiIIllIl() {
      if (this.IliiIIllIi == null) {
         return false;
      } else {
         return this.liliIIllIi != null && this.lliiIIllIi == null ? false : !this.IIiiIIllIi || this.iliiIIllIi != null && this.iIIIlIllIi > 0;
      }
   }

   llIllIliilIllIli(
      String type, int parent, String glyph, int iconKind, Class<? extends ilIllIiIll> radio, String iconName, llIllIliilIllIli name, boolean setting
   ) {
      this.liIIlIllIi = -1.0F;
      this.iliIlIllIi = -1.0F;
      this.lIliIIllIi = type;
      this.iIliIIllIi = llIlIiiilIlIii.IilliliilIIi(type);
      this.IlliIIllIi = parent;
      this.illiIIllIi = glyph;
      this.llliIIllIi = iconKind;
      this.IiliIIllIi = radio;
      this.liliIIllIi = iconName;
      this.iiliIIllIi = name;
      this.IIiiIIllIi = setting;
   }

   void lIiiIiIlilli(boolean on) {
      if (this.liiiIIllIl()) {
         if (this.iiliIIllIi != null) {
            if (on && !this.iiliIIllIi.iIlIlllllill()) {
               this.iiliIIllIi.lIiiIiIlilli(true);
            }

            if (this.lliiIIllIi.Iilllilliill() != on) {
               this.lliiIIllIi.IIillIiliIil(on);
            }
         } else if (this.IliiIIllIi.IliIlllilIi() != on) {
            this.IliiIIllIi.IIillIiliIil(on);
         }
      }
   }

   float Iiilliiliiil() {
      long var2 = 5719501132431322520L;
      if (this.IIiiIIllIi && this.iIIIlIllIi != 0) {
         var2 ^= ((long)this.iliIiiliiiii() << 32 ^ var2) & -1L << 32;
         if (this.ilIIlIllIi[(int)(var2 >>> 32)] < 0.0F) {
            this.ilIIlIllIi[(int)(var2 >>> 32)] = llilliilililliil.llIIlilIIl(this.llIIlIllIi[(int)(var2 >>> 32)]);
         }

         return this.ilIIlIllIi[(int)(var2 >>> 32)];
      } else {
         return this.IlIlllIlilIl();
      }
   }

   boolean IIlllIlliIll() {
      return this.IiiiIIllIi != null;
   }
}
