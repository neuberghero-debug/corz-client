package gg.corz;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Collection;
import net.minecraft.class_2338;

public final class llilIIIiililIIIi {
   private class_2338 lIlilIliil;
   private LongOpenHashSet iIlilIliil;
   private class_2338 IIlilIliil;

   public void IliIlllilIi(class_2338 a, class_2338 b) {
      this.IIlilIliil = a == null ? null : a.method_10062();
      this.lIlilIliil = b == null ? null : b.method_10062();
   }

   public int IlIlllIlilIl() {
      return Math.min(this.IIlilIliil.method_10263(), this.lIlilIliil.method_10263());
   }

   public int Ililllililil() {
      return this.Illlllllilll() - this.IlIlllIlilIl() + 1;
   }

   public boolean IiIiliIiiiIi(class_2338 p, int margin) {
      return p.method_10263() >= this.IlIlllIlilIl() - margin
         && p.method_10263() <= this.Illlllllilll() + margin
         && p.method_10264() >= this.IiIlliIliiIl() - margin
         && p.method_10264() <= this.Iilllilliill() + margin
         && p.method_10260() >= this.IIlllIlliIll() - margin
         && p.method_10260() <= this.IIillIiliIil() + margin;
   }

   public int Iilllilliill() {
      return Math.max(this.IIlilIliil.method_10264(), this.lIlilIliil.method_10264());
   }

   public int IIIilIIiiIIi() {
      return this.IIillIiliIil() - this.IIlllIlliIll() + 1;
   }

   public int Iiilliiliiil() {
      return this.Iilllilliill() - this.IiIlliIliiIl() + 1;
   }

   public void liiiIIllIl() {
      this.IIlilIliil = null;
      this.lIlilIliil = null;
      this.iIlilIliil = null;
   }

   public boolean IIIllIIliIIl() {
      return this.IIlilIliil != null && this.lIlilIliil != null;
   }

   public void iIlIlllllill(Collection<class_2338> cells) {
      LongOpenHashSet var2 = new LongOpenHashSet(cells.size());

      for (class_2338 var4 : cells) {
         var2.add(var4.method_10063());
      }

      this.iIlilIliil = var2;
   }

   public boolean iliIiiliiiii(class_2338 p) {
      return this.iIlilIliil == null || this.iIlilIliil.contains(p.method_10063());
   }

   public void IilliliilIIi() {
      this.iIlilIliil = null;
   }

   public int Illlllllilll() {
      return Math.max(this.IIlilIliil.method_10263(), this.lIlilIliil.method_10263());
   }

   public boolean lIiiIiIlilli() {
      return this.iIlilIliil != null;
   }

   public int IiIlliIliiIl() {
      return Math.min(this.IIlilIliil.method_10264(), this.lIlilIliil.method_10264());
   }

   public int IIillIiliIil() {
      return Math.max(this.IIlilIliil.method_10260(), this.lIlilIliil.method_10260());
   }

   public boolean IlIillIiilIi(class_2338 p) {
      return this.IiIiliIiiiIi(p, 0);
   }

   public int IIlllIlliIll() {
      return Math.min(this.IIlilIliil.method_10260(), this.lIlilIliil.method_10260());
   }
}
