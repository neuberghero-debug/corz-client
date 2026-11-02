package gg.corz;

import java.util.ArrayDeque;
import java.util.List;

public final class liillliliiilllil {
   private final int IlilliiIil;
   private final ArrayDeque<iIllIiIlIlllIiIl> llilliiIil = new ArrayDeque<>();
   private final long lIilliiIil;
   private int IiilliiIil;
   private int ililliiIil;
   private final long iIilliiIil;

   public String Iiilliiliiil() {
      iIllIiIlIlllIiIl var1 = this.llilliiIil.peek();
      return var1 == null ? null : var1.IilliliilIIi();
   }

   public boolean IIIllIIliIIl() {
      return this.llilliiIil.isEmpty();
   }

   public int iliIiiliiiii() {
      return this.IiilliiIil;
   }

   public iIllIiIlIlllIiIl IlIlllIlilIl() {
      return this.llilliiIil.peek();
   }

   public boolean IIillIiliIil(long feet) {
      return feet == this.lIilliiIil;
   }

   public boolean Ililllililil() {
      if (this.llilliiIil.isEmpty()) {
         return false;
      } else {
         for (iIllIiIlIlllIiIl var2 : this.llilliiIil) {
            if (var2.liiiIIllIl() == 0 || !var2.iIlIlllllill()) {
               return false;
            }
         }

         return true;
      }
   }

   public long IliIlllilIi() {
      return this.lIilliiIil;
   }

   public void Iilllilliill(long cell) {
      this.ililliiIil++;
      this.llilliiIil.removeIf(m -> m.IliIlllilIi() == cell);
   }

   public void IIlllIlliIll(iIllIiIlIlllIiIl m) {
      if (m != null) {
         this.llilliiIil.addFirst(m);
      }
   }

   public int iIlIlllllill() {
      return this.IlilliiIil;
   }

   public long liiiIIllIl() {
      return this.iIilliiIil;
   }

   public iIllIiIlIlllIiIl IiIlliIliiIl() {
      return this.llilliiIil.poll();
   }

   public liillliliiilllil(long stand, long geometry, List<iIllIiIlIlllIiIl> members) {
      this.lIilliiIil = stand;
      this.iIilliiIil = geometry;
      this.IlilliiIil = members.size();
      this.llilliiIil.addAll(members);
   }

   public int IilliliilIIi() {
      return this.llilliiIil.size();
   }

   @Override
   public String toString() {
      return IiIiliIiiiIi<"IiIiliIiiiIi","aKLL8Y3bV/27GKEQv+mEvQSWSZ/gyxeYFkQfE02GLgeVI9PxpRkbk6oG">()
         + llIiIiililIiIiil.IiIlliIliiIl(this.lIilliiIil)
         + IiIiliIiiiIi<"IiIiliIiiiIi","+CXyFt0kiFnmpX9ZXv6bDZEtC/Nq3Q6I6K1ivmU=">()
         + llIiIiililIiIiil.IIlllIlliIll(this.lIilliiIil)
         + IiIiliIiiiIi<"IiIiliIiiiIi","+CXyFt0kiFnmpX9ZXv6bDZEtC/Nq3Q6I6K1ivmU=">()
         + llIiIiililIiIiil.Illlllllilll(this.lIilliiIil)
         + IiIiliIiiiIi<"IiIiliIiiiIi","PL1PH+WNfD5HzXUN5e/RyzAlC/cxkpZDfgR184v3BJFb/FCu">()
         + this.IlilliiIil
         + IiIiliIiiiIi<"IiIiliIiiiIi","rOmIXi8/CLNqYdFT38iHnLS1Srr3iqrx3joWM7WI/XyqrkP9ydZM">()
         + this.llilliiIil.size()
         + IiIiliIiiiIi<"IiIiliIiiiIi","yjE7JAT6hV5tmFv4zRYumwyOLe5hDyUWbc80VBLsw/XsQM/B">()
         + this.ililliiIil
         + IiIiliIiiiIi<"IiIiliIiiiIi","oYnH5poB+pYnrLvLWfD7YzEWsSNGY4W6HtxltVyBV1KicSponw==">()
         + this.IiilliiIil
         + IiIiliIiiiIi<"IiIiliIiiiIi","4shTjZSmT3rgMci+srYupdETved+UnMi2PL++cM=">();
   }

   public int lIiiIiIlilli() {
      return this.ililliiIil;
   }

   public boolean Illlllllilll(long cell) {
      long var4 = -5272830342775385739L;
      var4 ^= ((long)this.llilliiIil.removeIf(cellx -> cellx.IliIlllilIi() == cell) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != 0) {
         this.IiilliiIil++;
      }

      return (boolean)((int)(var4 >>> 32));
   }
}
