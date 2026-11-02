package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;

final class llillIlilillIl {
   static final int liililIlliiililIll = 0;
   private int IiIiilIllliIiilIll;
   static final int iIIiilIllIlIiilIll = 2;
   private final List<Iiiillilliiillil> llIiilIllilIiilIll = new ArrayList<>();
   static final int IIIiilIlllIIiilIll = 1;

   boolean lIiiIiIlilli(double py, double amount, double px) {
      Iiiillilliiillil var7 = this.iIlIlllllill(py, amount);
      if (var7 == null || var7.iiIIiIIlil == 2) {
         return false;
      } else if (var7.iiIIiIIlil == 1 && var7.IllIiIIlil != null && px != 0.0) {
         var7.IllIiIIlil.accept(px > 0.0 ? 1 : -1);
         return true;
      } else {
         return true;
      }
   }

   boolean IilliliilIIi(double button, double py, int anims, iIllIilIlllIil px) {
      Iiiillilliiillil var7 = this.iIlIlllllill(button, py);
      if (var7 == null) {
         return false;
      } else {
         switch (var7.iiIIiIIlil) {
            case 1:
               if (var7.IllIiIIlil == null || anims != 0 && anims != 1) {
                  return true;
               }

               if (px != null && var7.lIlIiIIlil != null) {
                  px.IlIlllIlilIl(var7.lIlIiIIlil);
               }

               var7.IllIiIIlil.accept(anims == 1 ? -1 : 1);
               break;
            case 2:
               if (anims != 0 || var7.IllIiIIlil == null) {
                  return true;
               }

               if (px != null && var7.lIlIiIIlil != null) {
                  px.IlIlllIlilIl(var7.lIlIiIIlil);
               }

               var7.IllIiIIlil.accept(var7.IIlIiIIlil);
               break;
            default:
               if (anims != 0 || var7.iIlIiIIlil == null) {
                  return true;
               }

               if (px != null && var7.lIlIiIIlil != null) {
                  px.IlIlllIlilIl(var7.lIlIiIIlil);
               }

               var7.iIlIiIIlil.run();
         }

         return true;
      }
   }

   int iliIiiliiiii() {
      return this.IiIiilIllliIiilIll;
   }

   void IliIlllilIi() {
      long var3 = -1336496251000163644L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IiIiilIllliIiilIll; var5 += 4294967296L) {
         Iiiillilliiillil var2 = this.llIiilIllilIiilIll.get((int)(var5 >>> 32));
         var2.iIlIiIIlil = null;
         var2.IllIiIIlil = null;
         var2.lIlIiIIlil = null;
      }

      this.IiIiilIllliIiilIll = 0;
   }

   Iiiillilliiillil iIlIlllllill(double px, double py) {
      long var7 = 5182479964203112911L;

      for (long var9 = var7 ^ ((long)(this.IiIiilIllliIiilIll - 1) << 32 ^ var7) & -1L << 32; (int)(var9 >>> 32) >= 0; var9 += -4294967296L) {
         Iiiillilliiillil var6 = this.llIiilIllilIiilIll.get((int)(var9 >>> 32));
         if (var6.IliIlllilIi(px, py)) {
            return var6;
         }
      }

      return null;
   }

   void liiiIIllIl(float x, float id, float kind, float y, int arg, String act, Runnable w, IntConsumer h, int fn) {
      if (!(kind <= 0.0F) && !(y <= 0.0F) && (w != null || h != null)) {
         Iiiillilliiillil var10;
         if (this.IiIiilIllliIiilIll < this.llIiilIllilIiilIll.size()) {
            var10 = this.llIiilIllilIiilIll.get(this.IiIiilIllliIiilIll);
         } else {
            var10 = new Iiiillilliiillil();
            this.llIiilIllilIiilIll.add(var10);
         }

         this.IiIiilIllliIiilIll++;
         var10.llIIiIIlil = x;
         var10.ilIIiIIlil = id;
         var10.IiIIiIIlil = kind;
         var10.liIIiIIlil = y;
         var10.iiIIiIIlil = arg;
         var10.lIlIiIIlil = act;
         var10.iIlIiIIlil = w;
         var10.IllIiIIlil = h;
         var10.IIlIiIIlil = fn;
      }
   }
}
