package gg.corz;

import java.lang.ref.WeakReference;

public final class IiIllliliIllli {
   private WeakReference<Object> liililIIIl;

   public void iIlIlllllill() {
      this.liililIIIl = null;
   }

   public void IliIlllilIi(Object world) {
      this.liililIIIl = world == null ? null : new WeakReference<>(world);
   }

   public boolean liiiIIllIl(Object world) {
      WeakReference var2 = this.liililIIIl;
      return world != null && var2 != null && var2.get() == world;
   }
}
