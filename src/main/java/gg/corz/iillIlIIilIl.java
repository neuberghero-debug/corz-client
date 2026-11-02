package gg.corz;

import com.corz.client.mixins.AccessorInventoryScreen;
import java.awt.Color;
import net.minecraft.class_10017;
import net.minecraft.class_10042;
import net.minecraft.class_310;
import net.minecraft.class_332;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class iillIlIIilIl {
   private double liIIIilliiIIIill;
   private boolean IlIIIillllIIIill;
   private double ilIIIillIiIIIill;
   private float lIIIIilliIIIIill;
   private float iiiiilllIIIIIill = 0.0F;
   private static final float Iiiiilllliiiilll = (float) (Math.PI / 180.0);

   public boolean liiiIIllIl(double h, double button, int x, int w, int my, int mx, int y) {
      if (y == 0 && h >= (double)x && h <= (double)(x + my) && button >= (double)w && button <= (double)(w + mx)) {
         this.IlIIIillllIIIill = true;
         this.ilIIIillIiIIIill = h;
         this.liIIIilliiIIIill = button;
         return true;
      } else {
         return false;
      }
   }

   public iillIlIIilIl() {
      this.lIIIIilliIIIIill = 0.0F;
      this.IlIIIillllIIIill = false;
   }

   public void IilliliilIIi() {
      this.IlIIIillllIIIill = false;
   }

   public void IliIlllilIi(class_332 ctx, int y, int h, int x, int index, int w) {
      long var22 = -6612601401763029352L;
      IIIiiIillIIiiIil.lIiiIiIlilli(ctx, y, h, x, index, 6, IliiIilliiIi.IlIlllIlilIl(new Color(255, 255, 255, 18).getRGB()));
      IIIiiIillIIiiIil.lIiiIiIlilli(ctx, y + 1, h + 1, x - 2, index - 2, 5, IliiIilliiIi.IlIlllIlilIl(new Color(12, 12, 16, 236).getRGB()));
      class_310 var7 = class_310.method_1551();
      if (var7.field_1724 != null) {
         if (!lillliiliillliil.liIlliiIll()) {
            float var8 = 0.05859375F;
            float var9 = 1.8F;
            float var10 = 0.0F;
            float var11 = 0.3F;
            llllIlilllIl var12 = iIIlliIlIlIlliIl.iIliliiIll.get(Math.floorMod(w, iIIlliIlIlIlliIl.iIliliiIll.size()));
            liIlilIiiiIlilIi var13 = var12.Illlllllilll();
            if (var13 == null) {
               var12.IIlllIlliIll();
            } else {
               var9 = Math.max(var13.iililllIIi, 32.0F) * var8;
               var10 = Math.min(var13.illilllIIi, 0.0F) * var8;
               float var14 = Math.max(Math.abs(var13.lllilllIIi), Math.abs(var13.lililllIIi));
               float var15 = Math.max(Math.abs(var13.IililllIIi), Math.abs(var13.IIiilllIIi));
               var11 = (float)Math.sqrt((double)(var14 * var14 + var15 * var15)) * var8;
            }

            float var28 = Math.min((float)(index - 6) * 0.86F / (var9 - var10), (float)(x - 6) * 0.86F / (2.0F * Math.max(0.3F, var11)));
            var22 ^= ((long)Math.max(16, (int)Math.min((float)index * 0.46F, var28)) << 32 ^ var22) & -1L << 32;
            var22 ^= ((long)IiiIiiIlliiIiiIl.IlliIlIlll ^ var22) & -1L >>> 32;
            IiiIiiIlliiIiiIl.IlliIlIlll = w;

            try {
               class_10017 var17 = AccessorInventoryScreen.corzBuildEntityState(var7.field_1724);
               Quaternionf var18 = new Quaternionf().rotateZ((float) Math.PI);
               Quaternionf var19 = new Quaternionf().rotateX(this.lIIIIilliIIIIill * (float) (Math.PI / 180.0));
               var18.mul(var19);
               if (var17 instanceof class_10042 var20) {
                  var20.field_53446 = 180.0F + this.iiiiilllIIIIIill;
                  var20.field_53447 = 0.0F;
                  var20.field_53448 = 0.0F;
                  if (var20.field_53453 != 0.0F) {
                     var20.field_53329 = var20.field_53329 / var20.field_53453;
                     var20.field_53330 = var20.field_53330 / var20.field_53453;
                     var20.field_53453 = 1.0F;
                  }
               }

               Vector3f var29 = new Vector3f(0.0F, (var9 + var10) / 2.0F, 0.0F);
               ctx.method_70856(var17, (float)((int)(var22 >>> 32)), var29, var18, var19, y + 2, h + 2, y + x - 2, h + index - 2);
            } catch (Exception var26) {
            } finally {
               IiiIiiIlliiIiiIl.IlliIlIlll = (int)var22;
            }
         }
      }
   }

   public void iIlIlllllill(double my, double mx) {
      if (this.IlIIIillllIIIill) {
         this.iiiiilllIIIIIill = lIIliliIIlil.iIlIlllllill(this.iiiiilllIIIIIill + lIIliliIIlil.IliIlllilIi(my - this.ilIIIillIiIIIill));
         this.lIIIIilliIIIIill = lIIliliIIlil.IilliliilIIi(this.lIIIIilliIIIIill + lIIliliIIlil.liiiIIllIl(mx - this.liIIIilliiIIIill));
         this.ilIIIillIiIIIill = my;
         this.liIIIilliiIIIill = mx;
      }
   }
}
