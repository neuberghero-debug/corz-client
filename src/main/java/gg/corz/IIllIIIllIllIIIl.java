package gg.corz;

import java.util.ArrayList;
import java.util.List;

public final class IIllIIIllIllIIIl {
   private final boolean liiliiIlIl;
   public static final IIllIIIllIllIIIl ililiiIlIl = new IIllIIIllIllIIIl(true);
   private final List<IliIIlillliIIlil> IiiliiIlIl = new ArrayList<>();

   public void liiiIIllIl(float h, float act, float x, float y, Runnable w) {
      this.iIlIlllllill(h, act, x, y, w, null, null);
   }

   private IIllIIIllIllIIIl(boolean sink) {
      this.liiliiIlIl = sink;
   }

   public void IliIlllilIi() {
      this.IiiliiIlIl.clear();
   }

   public boolean IilliliilIIi(double my, double mx) {
      long var7 = -9163924183627096322L;

      for (long var9 = var7 ^ ((long)(this.IiiliiIlIl.size() - 1) << 32 ^ var7) & -1L << 32; (int)(var9 >>> 32) >= 0; var9 += -4294967296L) {
         IliIIlillliIIlil var6 = this.IiiliiIlIl.get((int)(var9 >>> 32));
         if (my >= (double)var6.liliiilIil
            && my <= (double)(var6.liliiilIil + var6.IIiiiilIil)
            && mx >= (double)var6.iiliiilIil
            && mx <= (double)(var6.iiliiilIil + var6.lIiiiilIil)) {
            if (var6.IliiiilIil != null && var6.lliiiilIil != null) {
               var6.IliiiilIil.liiiIIllIl(var6.lliiiilIil);
            }

            var6.iIiiiilIil.run();
            return true;
         }
      }

      return false;
   }

   public IIllIIIllIllIIIl() {
      this(false);
   }

   public void iIlIlllllill(float h, float y, float x, float press, Runnable anims, iIliililIlliilil w, String act) {
      if (!this.liiliiIlIl && anims != null && !(x <= 0.0F) && !(press <= 0.0F)) {
         this.IiiliiIlIl.add(new IliIIlillliIIlil(h, y, x, press, anims, w, act));
      }
   }
}
