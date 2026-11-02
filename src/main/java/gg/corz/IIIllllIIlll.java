package gg.corz;

import java.util.List;
import java.util.Set;

public record IIIllllIIlll(
   long root,
   List<Long> members,
   iiiIlIIiIIIllIIi state,
   lIllIIIiiIllIIIi current,
   Set<lIllIIIiiIllIIIi> tried,
   ilIiIlIlIiIiIlIl dependency,
   long dependencyKey,
   long epoch,
   int attempts,
   long lastDispatchSeq,
   String why
) {
   private final iiiIlIIiIIIllIIi iIiIlIIiIliIlIIi;
   private final int ilIllIIiIiIllIIi;
   private final long lilIlIIiiilIlIIi;
   private final long liIllIIiiiIllIIi;
   private final Set<lIllIIIiiIllIIIi> IiiIlIIiliiIlIIi;
   private final long lIIllIIiiIIllIIi;
   private final List<Long> IIiIlIIilIiIlIIi;
   private final lIllIIIiiIllIIIi lliIlIIiiliIlIIi;
   private final String IIlllIIilIlllIIi;
   private final ilIiIlIlIiIiIlIl iiiIlIIiIIIllIIi;
   private final long IlIllIIillIllIIi;

   public List<Long> IilliliilIIi() {
      return this.IIiIlIIilIiIlIIi;
   }

   public boolean liiiIIllIl() {
      return this.iIiIlIIiIliIlIIi == gg.corz.iiiIlIIiIIIllIIi.iIIiilliil;
   }

   public boolean IliIlllilIi() {
      return this.iIiIlIIiIliIlIIi == gg.corz.iiiIlIIiIIIllIIi.IiIiilliil
         || this.iIiIlIIiIliIlIIi == gg.corz.iiiIlIIiIIIllIIi.liIiilliil
         || this.iIiIlIIiIliIlIIi == gg.corz.iiiIlIIiIIIllIIi.iiIiilliil;
   }

   public long Iilllilliill() {
      return this.liIllIIiiiIllIIi;
   }

   public long iIlIlllllill() {
      return this.lilIlIIiiilIlIIi;
   }

   public String IIillIiliIil() {
      return this.IIlllIIilIlllIIi;
   }

   public lIllIIIiiIllIIIi iliIiiliiiii() {
      return this.lliIlIIiiliIlIIi;
   }

   public Set<lIllIIIiiIllIIIi> IIIllIIliIIl() {
      return this.IiiIlIIiliiIlIIi;
   }

   public IIIllllIIlll(
      long root,
      List<Long> members,
      iiiIlIIiIIIllIIi state,
      lIllIIIiiIllIIIi current,
      Set<lIllIIIiiIllIIIi> tried,
      ilIiIlIlIiIiIlIl dependency,
      long dependencyKey,
      long epoch,
      int attempts,
      long lastDispatchSeq,
      String why
   ) {
      this.lilIlIIiiilIlIIi = root;
      this.IIiIlIIilIiIlIIi = members;
      this.iIiIlIIiIliIlIIi = state;
      this.lliIlIIiiliIlIIi = current;
      this.IiiIlIIiliiIlIIi = tried;
      this.iiiIlIIiIIIllIIi = dependency;
      this.lIIllIIiiIIllIIi = dependencyKey;
      this.IlIllIIillIllIIi = epoch;
      this.ilIllIIiIiIllIIi = attempts;
      this.liIllIIiiiIllIIi = lastDispatchSeq;
      this.IIlllIIilIlllIIi = why;
   }

   public long IiIlliIliiIl() {
      return this.lIIllIIiiIIllIIi;
   }

   public ilIiIlIlIiIiIlIl IlIlllIlilIl() {
      return this.iiiIlIIiIIIllIIi;
   }

   public int Illlllllilll() {
      return this.ilIllIIiIiIllIIi;
   }

   public long IIlllIlliIll() {
      return this.IlIllIIillIllIIi;
   }

   public iiiIlIIiIIIllIIi lIiiIiIlilli() {
      return this.iIiIlIIiIliIlIIi;
   }
}
