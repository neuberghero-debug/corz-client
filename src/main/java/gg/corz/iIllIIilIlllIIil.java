package gg.corz;

import com.corz.client.mixins.AccessorInventoryScreen;
import java.awt.Color;
import net.minecraft.class_10017;
import net.minecraft.class_10042;
import net.minecraft.class_310;
import net.minecraft.class_332;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class iIllIIilIlllIIil {
   private double liiiIlIIil;
   private boolean IiiiIlIIil;
   private float iliiIlIIil;
   private static final float IliiIlIIil = (float) (Math.PI / 180.0);
   private double iiiiIlIIil;
   private float lliiIlIIil = 0.0F;

   public boolean liiiIIllIl(double mx, double h, int button, int w, int x, int my, int y) {
      if (y == 0 && mx >= (double)button && mx <= (double)(button + x) && h >= (double)w && h <= (double)(w + my)) {
         this.IiiiIlIIil = true;
         this.liiiIlIIil = mx;
         this.iiiiIlIIil = h;
         return true;
      } else {
         return false;
      }
   }

   public void IliIlllilIi(class_332 x, int y, int index, int h, int w, int ctx) {
      long var16 = 3351868162072852603L;
      long var18 = -8438933782021493632L;
      IIIiiIillIIiiIil.lIiiIiIlilli(x, y, index, h, w, 6, IliiIilliiIi.IlIlllIlilIl(new Color(255, 255, 255, 18).getRGB()));
      IIIiiIillIIiiIil.lIiiIiIlilli(x, y + 1, index + 1, h - 2, w - 2, 5, IliiIilliiIi.IlIlllIlilIl(new Color(12, 12, 16, 236).getRGB()));
      class_310 var7 = class_310.method_1551();
      if (var7.field_1724 != null) {
         if (!lillliiliillliil.liIlliiIll()) {
            var16 ^= ((long)Math.max(20, (int)((float)w * 0.46F)) << 32 ^ var16) & -1L << 32;
            var16 ^= ((long)iiIiilIIliil.IIlllIiilIlllIii ^ var16) & -1L >>> 32;
            iiIiilIIliil.IIlllIiilIlllIii = ctx;
            var18 ^= ((long)IiiIiiIlliiIiiIl.IlliIlIlll << 32 ^ var18) & -1L << 32;
            IiiIiiIlliiIiiIl.IlliIlIlll = -2;

            try {
               class_10017 var11 = AccessorInventoryScreen.corzBuildEntityState(var7.field_1724);
               Quaternionf var12 = new Quaternionf().rotateZ((float) Math.PI);
               Quaternionf var13 = new Quaternionf().rotateX(this.iliiIlIIil * (float) (Math.PI / 180.0));
               var12.mul(var13);
               if (var11 instanceof class_10042 var14) {
                  var14.field_53446 = 180.0F + this.lliiIlIIil;
                  var14.field_53447 = 0.0F;
                  var14.field_53448 = 0.0F;
                  if (var14.field_53453 != 0.0F) {
                     var14.field_53329 = var14.field_53329 / var14.field_53453;
                     var14.field_53330 = var14.field_53330 / var14.field_53453;
                     var14.field_53453 = 1.0F;
                  }
               }

               Vector3f var24 = new Vector3f(0.0F, var11.field_53330 / 2.0F, 0.0F);
               x.method_70856(var11, (float)((int)(var16 >>> 32)), var24, var12, var13, y + 2, index + 2, y + h - 2, index + w - 2);
            } catch (Exception var22) {
            } finally {
               iiIiilIIliil.IIlllIiilIlllIii = (int)var16;
               IiiIiiIlliiIiiIl.IlliIlIlll = (int)(var18 >>> 32);
            }
         }
      }
   }

   public void iIlIlllllill(double my, double mx) {
      if (this.IiiiIlIIil) {
         this.lliiIlIIil = lIIliliIIlil.iIlIlllllill(this.lliiIlIIil + lIIliliIIlil.IliIlllilIi(my - this.liiiIlIIil));
         this.iliiIlIIil = lIIliliIIlil.IilliliilIIi(this.iliiIlIIil + lIIliliIIlil.liiiIIllIl(mx - this.iiiiIlIIil));
         this.liiiIlIIil = my;
         this.iiiiIlIIil = mx;
      }
   }

   public iIllIIilIlllIIil() {
      this.iliiIlIIil = 0.0F;
      this.IiiiIlIIil = false;
   }

   public void IilliliilIIi() {
      this.IiiiIlIIil = false;
   }
}
