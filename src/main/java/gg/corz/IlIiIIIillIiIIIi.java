package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

final class IlIiIIIillIiIIIi {
   ArrayList<llIiIliilIiIli> iiiliIliil;
   final float lIIiiIliil;
   final Map<String, llIiIliilIiIli> IiiliIliil;
   boolean ilIiiIliil;
   float llIiiIliil;
   final float IIIiiIliil;
   final boolean iIIiiIliil;
   float IlIiiIliil;
   ArrayList<llIiIliilIiIli> liiliIliil;

   IlIiIIIillIiIIIi(IIililillIililil scale, final float param2, float pills, boolean rowH) {
      this.IiIiiIliil = scale;
      this.IiiliIliil = new HashMap<>();
      this.liiliIliil = new ArrayList<>();
      this.iiiliIliil = new ArrayList<>();
      this.IIIiiIliil = var2;
      this.lIIiiIliil = pills;
      this.iIIiiIliil = rowH;
   }

   void IilliliilIIi(float k) {
      this.IlIiiIliil = 0.0F;
      this.llIiiIliil = 0.0F;
      this.ilIiiIliil = false;

      for (int var2 = 0; var2 < this.liiliIliil.size(); var2++) {
         llIiIliilIiIli var3 = this.liiliIliil.get(var2);
         if (var3.iliIiiliiiii(this.IlIiiIliil, k)) {
            this.IiiliIliil.remove(var3.lIIiIlIIIl);
            this.liiliIliil.remove(var2--);
         } else {
            this.IlIiiIliil = this.IlIiiIliil + var3.IilliliilIIi();
            if (!var3.IlliIlIIIl) {
               this.ilIiiIliil = true;
               this.llIiiIliil = Math.max(this.llIiiIliil, var3.liIiIlIIIl);
            }
         }
      }
   }

   void liiiIIllIl(ilIllIiIll m) {
      long var6 = -696138128652596123L;
      String var2 = m.IilliliilIIi();
      llIiIliilIiIli var3 = this.IiiliIliil.get(var2);
      if (var3 == null) {
         var3 = new llIiIliilIiIli(var2, llliIlIlilliIlIl.lIliliIlil(var2, this.lIIiiIliil), this.IIIiiIliil);
         this.IiiliIliil.put(var2, var3);
      }

      var3.liiiIIllIl();
      var6 ^= ((long)m.IIIilIIiiIIi() << 32 ^ var6) & -1L << 32;
      if (this.iIIiiIliil && (int)(var6 >>> 32) != var3.illiIlIIIl) {
         var3.illiIlIIIl = (int)(var6 >>> 32);
         String var5 = this.IiIiiIliil.IllIillllIil((int)(var6 >>> 32));
         var3.IliIlllilIi(var5, llliIlIlilliIlIl.lIliliIlil(var5, 0.72F));
      }

      this.iiiliIliil.add(var3);
   }

   void iIlIlllllill() {
      for (int var1 = 0; var1 < this.liiliIliil.size(); var1++) {
         llIiIliilIiIli var2 = this.liiliIliil.get(var1);
         if (var2.IlliIlIIIl) {
            this.iiiliIliil.add(Math.min(var1, this.iiiliIliil.size()), var2);
         }
      }

      float var4 = 0.0F;

      for (int var5 = 0; var5 < this.iiiliIliil.size(); var5++) {
         llIiIliilIiIli var3 = this.iiiliIliil.get(var5);
         var3.lIiiIiIlilli(var4);
         var4 += var3.IilliliilIIi();
      }

      ArrayList var6 = this.liiliIliil;
      this.liiliIliil = this.iiiliIliil;
      this.iiiliIliil = var6;
   }

   void lIiiIiIlilli(float top, float left, float right) {
      for (int var4 = 0; var4 < this.liiliIliil.size(); var4++) {
         llIiIliilIiIli var5 = this.liiliIliil.get(var4);
         float var6 = var5.lIliIlIIIl;
         if (!(var6 <= 0.002F)) {
            float var7 = var5.IilliliilIIi();
            float var8 = top + var5.iiIiIlIIIl + var5.IIliIlIIIl;
            float var9 = IliiIilliiIi.IilliliilIIi(var6 * var6);

            try {
               llliIlIlilliIlIl.lliIliliIl(var5.lIIiIlIIIl, left, var8, var7, this.lIIiiIliil, llliIlIlilliIlIl.liIlIlIiIl);
               if (var5.IiIiIlIIIl > 0.0F) {
                  llliIlIlilliIlIl.IIiIllIiIl(right, var8, var7, var5.llIiIlIIIl, var5.ilIiIlIIIl, var5.IiIiIlIIIl);
               }
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var9);
            }
         }
      }
   }

   void IliIlllilIi() {
      for (int var1 = 0; var1 < this.liiliIliil.size(); var1++) {
         this.liiliIliil.get(var1).iIlIlllllill();
      }

      this.iiiliIliil.clear();
   }
}
