package gg.corz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

final class iiIlllIIllll {
   final long llIilIIiilIilIIi;
   long liiIiIIiiiiIiIIi;
   List<Long> IiIilIIiliIilIIi;
   int IiiilIIiliiilIIi;
   long lIlliIIiiIlliIIi;
   long[] llIliIIiilIliIIi;
   int[] IiIliIIiliIliIIi;
   List<Long> IilIiIIililIiIIi;
   long IIiilIIilIiilIIi;
   int IIlIiIIilIlIiIIi;
   long iilIiIIiIIiIiIIi;
   long IliIiIIilliIiIIi;
   String IllliIIilllliIIi;
   int iIlIiIIiIllIiIIi;
   long iIIliIIiIlIliIIi;
   int ilIIiIIiIiIIiIIi;
   int[] iiIliIIiIIlliIIi;
   lIllIIIiiIllIIIi lIlilIIiiIlilIIi;
   int IlIIiIIillIIiIIi;
   ilIiIlIlIiIiIlIl illilIIiIililIIi;
   iiiIlIIiIIIllIIi iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
   int liIIiIIiiiIIiIIi;
   long iliIiIIiIiiIiIIi;
   long IIIliIIilIIliIIi;
   int lllIiIIiillIiIIi;
   long lililIIiiililIIi;
   int iiiilIIiIIIIiIIi;
   int iIiilIIiIliilIIi;
   final EnumSet<lIllIIIiiIllIIIi> IllilIIilllilIIi = EnumSet.noneOf(lIllIIIiiIllIIIi.class);
   long lIiIiIIiiIiIiIIi;
   int lIIIiIIiiIIIiIIi;
   int lliilIIiiliilIIi;

   IIIllllIIlll liiiIIllIl() {
      return new IIIllllIIlll(
         this.llIilIIiilIilIIi,
         Collections.unmodifiableList(new ArrayList<>(this.IiIilIIiliIilIIi)),
         this.iiIilIIiIIlilIIi,
         this.lIlilIIiiIlilIIi,
         Collections.unmodifiableSet(EnumSet.copyOf(this.IllilIIilllilIIi.isEmpty() ? EnumSet.noneOf(lIllIIIiiIllIIIi.class) : this.IllilIIilllilIIi)),
         this.illilIIiIililIIi,
         this.lililIIiiililIIi,
         this.IIiilIIilIiilIIi,
         this.iIiilIIiIliilIIi,
         this.lIlliIIiiIlliIIi,
         this.IllliIIilllliIIi
      );
   }

   iiIlllIIllll(long members, List<Long> root, long epoch) {
      this.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
      this.lllIiIIiillIiIIi = Integer.MAX_VALUE;
      this.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
      this.lIiIiIIiiIiIiIIi = Long.MIN_VALUE;
      this.iliIiIIiIiiIiIIi = -1L;
      this.liiIiIIiiiiIiIIi = Long.MIN_VALUE;
      this.IIIliIIilIIliIIi = -4611686018427387904L;
      this.iIIliIIiIlIliIIi = Long.MIN_VALUE;
      this.llIliIIiilIliIIi = new long[0];
      this.IiIliIIiliIliIIi = new int[0];
      this.iiIliIIiIIlliIIi = new int[0];
      this.IllliIIilllliIIi = "";
      this.llIilIIiilIilIIi = members;
      this.IiIilIIiliIilIIi = root;
      this.IIiilIIilIiilIIi = epoch;
   }

   boolean IliIlllilIi() {
      return this.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.IiIiilliil
         || this.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.liIiilliil
         || this.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iiIiilliil;
   }
}
