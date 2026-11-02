package gg.corz;

import net.minecraft.class_4588;
import org.joml.Matrix4f;

final class liilIIliiiilIIli implements lilIlIIiiilIlIIi {
   private class_4588 llIlilIlIi;
   private class_4588 ilIlilIlIi;
   private Matrix4f IiIlilIlIi;

   @Override
   public void IliIlllilIi(
      float cd, float cc, float az, int dy, float cz, float ca, float dx, int bz, float by, float cb, float cy, int cx, float bx, float dz, float ax, int ay
   ) {
      if (this.llIlilIlIi == null) {
         this.llIlilIlIi = iIiiIIilIliiIIil.lIiiIiIlilli();
      }

      iIiiIIilIliiIIil.IlIlllIlilIl(this.llIlilIlIi, this.IiIlilIlIi, cd, cc, az, dy, cz, ca, dx, bz, by, cb, cy, cx, bx, dz, ax, ay);
   }

   void iIlIlllllill(Matrix4f m) {
      this.IiIlilIlIi = m;
      this.llIlilIlIi = null;
      this.ilIlilIlIi = null;
   }

   private liilIIliiiilIIli() {
   }

   @Override
   public void liiiIIllIl(float cb, float bx, float bz, int ay, float az, float ax, float cz, int cx, float cy, float cc, float ca, int by) {
      if (this.ilIlilIlIi == null) {
         this.ilIlilIlIi = iIiiIIilIliiIIil.IIIllIIliIIl();
      }

      iIiiIIilIliiIIil.IiIlliIliiIl(this.ilIlilIlIi, this.IiIlilIlIi, cb, bx, bz, ay, az, ax, cz, cx, cy, cc, ca, by);
   }

   void IilliliilIIi() {
      this.llIlilIlIi = null;
      this.ilIlilIlIi = null;
      this.IiIlilIlIi = null;
   }
}
