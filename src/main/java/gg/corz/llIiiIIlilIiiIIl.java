package gg.corz;

import com.corz.client.mixins.AccessorHandledScreen;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_465;

public class llIiiIIlilIiiIIl {
   private static final int iIilIlilIl = 16;
   private final class_465<?> ililIlilIl;
   private static final int IlilIlilIl = 12;
   private final AccessorHandledScreen IiilIlilIl;
   private static final int lIilIlilIl = 26;
   private final iIliiIllii liilIlilIl;
   private static final int IIilIlilIl = 22;
   private static final int lillIlilIl = 74;
   private static final int iillIlilIl = 74;
   private static final int llilIlilIl = 16;

   private void IIIilIIiiIIi(class_332 shadow, class_327 cx, String y, int font, int color, int text, boolean g) {
      shadow.method_51439(cx, class_2561.method_43470(y), font - cx.method_1727(y) / 2, color, text, g);
   }

   private void Ililllililil(class_332 i, class_327 my, int pickable, int accent, int mx, boolean font, int g) {
      long var16 = -3662964967163043455L;
      long var18 = -7752408022436615176L;
      long var20 = -7069645639688436851L;
      long var22 = -8475213726379095366L;
      var16 ^= ((long)this.IiIlliIliiIl(pickable) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)this.IIlllIlliIll(pickable) ^ var16) & -1L >>> 32;
      var18 ^= ((long)(this.liilIlilIl.lIIlliIIll() == pickable && this.liilIlilIl.iiiIlIIIll() != ilIiiIIiIiIiiIIi.IIliIiiiil ? 1 : 0) << 32 ^ var18)
         & -1L << 32;
      var18 ^= ((long)(font && Iilllilliill((double)accent, (double)mx, (int)(var16 >>> 32), (int)var16, 22, 22) ? 1 : 0) ^ var18) & -1L >>> 32;
      String var12 = Integer.toString(pickable + 1);
      var20 ^= ((long)((int)(var16 >>> 32) + 11) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)((int)var16 + 7) ^ var20) & -1L >>> 32;
      if ((int)(var18 >>> 32) != 0) {
         i.method_25294((int)(var16 >>> 32), (int)var16, (int)(var16 >>> 32) + 22, (int)var16 + 22, g);
         IlIillIiilIi(i, (int)(var16 >>> 32), (int)var16, 22, 22, Illillliilli(g));
         this.IIIilIIiiIIi(i, my, var12, (int)(var20 >>> 32), (int)var20, -16119284, false);
      } else {
         i.method_25294((int)(var16 >>> 32), (int)var16, (int)(var16 >>> 32) + 22, (int)var16 + 22, (int)var18 != 0 ? IIlilIliiIli(g, 0.22F) : -15460837);
         IlIillIiilIi(i, (int)(var16 >>> 32), (int)var16, 22, 22, (int)var18 != 0 ? IIlilIliiIli(g, 0.6F) : -14013389);
         var22 ^= ((long)(!font ? -8421505 : ((int)var18 != 0 ? Illillliilli(g) : -1)) << 32 ^ var22) & -1L << 32;
         this.IIIilIIiiIIi(i, my, var12, (int)(var20 >>> 32), (int)var20, (int)(var22 >>> 32), false);
      }
   }

   private int IilliliilIIi() {
      return this.iIlIlllllill() + 8 + 12 + 4;
   }

   private int IiIlliIliiIl(int i) {
      return this.liiiIIllIl() + 8 + i % 3 * 26;
   }

   private static void IlIillIiilIi(class_332 w, int g, int h, int y, int x, int color) {
      w.method_25294(g, h, g + y, h + 1, color);
      w.method_25294(g, h + x - 1, g + y, h + x, color);
      w.method_25294(g, h, g + 1, h + x, color);
      w.method_25294(g + y - 1, h, g + y, h + x, color);
   }

   private int lIiiIiIlilli() {
      return this.IilliliilIIi() + 74 + 6;
   }

   private int IlIlllIlilIl() {
      return this.IIIllIIliIIl() + 16 + 7 - this.iIlIlllllill();
   }

   private int Illlllllilll() {
      return this.liiiIIllIl() + 8;
   }

   public boolean IiIiliIiiiIi(double button, double mx, int my) {
      long var7 = 4512976229583434942L;
      if (!this.liilIlilIl.IliIlllilIi()) {
         return false;
      } else if (!Iilllilliill(button, mx, this.liiiIIllIl(), this.iIlIlllllill(), this.IliIlllilIi(), this.IlIlllIlilIl())) {
         return false;
      } else {
         if (my == 0) {
            if (this.liilIlilIl.ilIllIiIll()) {
               for (long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < 9; var9 += 4294967296L) {
                  if (Iilllilliill(button, mx, this.IiIlliIliiIl((int)(var9 >>> 32)), this.IIlllIlliIll((int)(var9 >>> 32)), 22, 22)) {
                     this.liilIlilIl.iIlllIllll((int)(var9 >>> 32));
                     return true;
                  }
               }
            }

            if (this.liilIlilIl.liIlliiIll() && Iilllilliill(button, mx, this.Illlllllilll(), this.lIiiIiIlilli(), 74, 16)) {
               this.liilIlilIl.lllllillll();
               return true;
            }

            if (Iilllilliill(button, mx, this.Illlllllilll(), this.iliIiiliiiii(), 74, 12)) {
               this.liilIlilIl.Iillllilll();
               return true;
            }
         }

         return true;
      }
   }

   public llIiiIIlilIiiIIl(class_465<?> screen, iIliiIllii mod) {
      this.ililIlilIl = screen;
      this.IiilIlilIl = (AccessorHandledScreen)screen;
      this.liilIlilIl = mod;
   }

   public void IIillIiliIil(class_332 my, int mx, int g) {
      long var17 = -3075593261685028625L;
      long var19 = -3861513072252212081L;
      long var13 = 6345739592893423409L;
      long var15 = -1925944279665469416L;
      if (this.liilIlilIl.IliIlllilIi()) {
         class_327 var4 = class_310.method_1551().field_1772;
         var13 ^= ((long)IlIIilIlllIIilIl.lliiIlliIl << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)this.liiiIIllIl() ^ var13) & -1L >>> 32;
         var15 ^= ((long)this.iIlIlllllill() << 32 ^ var15) & -1L << 32;
         var15 ^= ((long)this.IliIlllilIi() ^ var15) & -1L >>> 32;
         var17 ^= ((long)this.IlIlllIlilIl() << 32 ^ var17) & -1L << 32;
         my.method_25294((int)var13 - 1, (int)(var15 >>> 32) - 1, (int)var13 + (int)var15 + 1, (int)(var15 >>> 32) + (int)(var17 >>> 32) + 1, -435549171);
         my.method_25294((int)var13, (int)(var15 >>> 32), (int)var13 + (int)var15, (int)(var15 >>> 32) + (int)(var17 >>> 32), -16184564);
         IlIillIiilIi(my, (int)var13, (int)(var15 >>> 32), (int)var15, (int)(var17 >>> 32), IIlilIliiIli((int)(var13 >>> 32), 0.45F));
         this.IIIilIIiiIIi(
            my,
            var4,
            Iilililiiili<"Iilililiiili","0/cg955Ufvipfn/1QYOjdHjeQ3kgl6A9/chGFwgx3HNLr0OHzc++eQalRw==">(),
            (int)var13 + (int)var15 / 2,
            (int)(var15 >>> 32) + 8,
            (int)(var13 >>> 32),
            false
         );
         var17 ^= ((long)this.liilIlilIl.ilIllIiIll() ^ var17) & -1L >>> 32;

         for (var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < 9; var19 += 4294967296L) {
            this.Ililllililil(my, var4, (int)(var19 >>> 32), mx, g, (boolean)((int)var17), (int)(var13 >>> 32));
         }

         this.Iiilliiliiil(
            my,
            var4,
            this.Illlllllilll(),
            this.lIiiIiIlilli(),
            74,
            16,
            Iilililiiili<"Iilililiiili","Vc1LCfa/HZTN1T8kvJkAE8XUqP7eetOhG/TZan6Ceg8ESkA=">(),
            this.liilIlilIl.liIlliiIll(),
            mx,
            g,
            (int)(var13 >>> 32)
         );
         var19 ^= ((long)(this.liilIlilIl.iiiIlIIIll() == ilIiiIIiIiIiiIIi.IIliIiiiil && this.liilIlilIl.lIIlliIIll() < 0 ? 0 : 1) << 32 ^ var19) & -1L << 32;
         this.Iiilliiliiil(
            my,
            var4,
            this.Illlllllilll(),
            this.iliIiiliiiii(),
            74,
            12,
            Iilililiiili<"Iilililiiili","YVkFaClXShBlegQVxJd15vAGsdVssye6AgR7bs/8MTjq">(),
            (boolean)((int)(var19 >>> 32)),
            mx,
            g,
            (int)(var13 >>> 32)
         );

         String var12 = switch (this.liilIlilIl.iiiIlIIIll()) {
            case lIliIiiiil -> Iilililiiili<"Iilililiiili","RlQcguR5wwhvNCGmC0XZsTAOWekAb3lt26+vF0gT+Gd57BYYCzE=">() + this.liilIlilIl.IlIllllIll();
            case iIliIiiiil -> Iilililiiili<"Iilililiiili","czr52koUkdUsK9p2bJx7mO/IH7q8BP36k4itmv+HuklblA==">() + (this.liilIlilIl.lIIlliIIll() + 1);
            case IlliIiiiil -> Iilililiiili<"Iilililiiili","OH+kc9i/7kIcDumt7siBBr+6GCBTpXI4eI6DNwRYtop7Y5aLMNzu/Jo=">() + this.liilIlilIl.IlIllllIll();
            default -> Iilililiiili<"Iilililiiili","DqUuM0c6ai/YkD6rnTC1ybY/GQsVFDjLXLATCrivT0TNnJVaGEmB">();
         };
         this.IIIilIIiiIIi(my, var4, var12, (int)var13 + (int)var15 / 2, this.IIIllIIliIIl() + 4, -8421505, false);
      }
   }

   private int liiiIIllIl() {
      long var3 = -1166019695130942978L;
      var3 ^= ((long)(this.IiilIlilIl.corzX() + this.IiilIlilIl.corzBackgroundWidth() + 6) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) + this.IliIlllilIi() > this.ililIlilIl.field_22789) {
         var3 ^= ((long)(this.IiilIlilIl.corzX() - this.IliIlllilIi() - 6) ^ var3) & -1L >>> 32;
         if ((int)var3 >= 2) {
            return (int)var3;
         }
      }

      return (int)(var3 >>> 32);
   }

   private int IIIllIIliIIl() {
      return this.iliIiiliiiii() + 12 + 5;
   }

   private int IliIlllilIi() {
      return 90;
   }

   private int iIlIlllllill() {
      return this.IiilIlilIl.corzY();
   }

   private static int IIlilIliiIli(int a, float argb) {
      return ((int)(argb * 255.0F) & 0xFF) << 24 | a & 16777215;
   }

   private int IIlllIlliIll(int i) {
      return this.IilliliilIIi() + i / 3 * 26;
   }

   private static boolean Iilllilliill(double x, double h, int y, int w, int mx, int my) {
      return x >= (double)y && x < (double)(y + mx) && h >= (double)w && h < (double)(w + my);
   }

   private static int Illillliilli(int argb) {
      long var4 = 7374608021735598212L;
      long var6 = -879340164416409040L;
      var4 ^= ((long)Math.min(255, (argb >> 16 & 0xFF) + 60) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)Math.min(255, (argb >> 8 & 0xFF) + 60) ^ var4) & -1L >>> 32;
      var6 ^= ((long)Math.min(255, (argb & 0xFF) + 60) << 32 ^ var6) & -1L << 32;
      return 0xFF000000 | (int)(var4 >>> 32) << 16 | (int)var4 << 8 | (int)(var6 >>> 32);
   }

   private int iliIiiliiiii() {
      return this.lIiiIiIlilli() + 16 + 3;
   }

   private void Iiilliiliiil(class_332 mx, class_327 y, int label, int enabled, int h, int w, String my, boolean accent, int x, int g, int font) {
      long var17 = 1779892621130315745L;
      long var15 = 4385427236656344529L;
      var15 ^= ((long)(accent && Iilllilliill((double)x, (double)g, label, enabled, h, w) ? 1 : 0) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(!accent ? -15724010 : ((int)(var15 >>> 32) != 0 ? IIlilIliiIli(font, 0.28F) : -15263200)) ^ var15) & -1L >>> 32;
      mx.method_25294(label, enabled, label + h, enabled + w, (int)var15);
      IlIillIiilIi(mx, label, enabled, h, w, accent ? IIlilIliiIli(font, (int)(var15 >>> 32) != 0 ? 0.7F : 0.4F) : -14013389);
      var17 ^= ((long)(!accent ? -8421505 : ((int)(var15 >>> 32) != 0 ? Illillliilli(font) : -1)) << 32 ^ var17) & -1L << 32;
      this.IIIilIIiiIIi(mx, y, my, label + h / 2, enabled + (w - 8) / 2, (int)(var17 >>> 32), false);
   }
}
