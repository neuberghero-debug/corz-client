package gg.corz;

import java.util.List;

record lilliIlliilliIll(List<IIlIIIilIlIIIi> boxes, boolean hazard, boolean trap, boolean interactive, boolean ownDirt, boolean reserved, boolean foreign) {
   private final boolean iiIlIiilll;
   private final boolean lIllIiilll;
   private final boolean iIllIiilll;
   private final boolean llllIiilll;
   private final List<IIlIIIilIlIIIi> liIlIiilll;
   private final boolean IIllIiilll;
   private final boolean IlllIiilll;

   public List<IIlIIIilIlIIIi> IliIlllilIi() {
      return this.liIlIiilll;
   }

   public boolean liiiIIllIl() {
      return this.iiIlIiilll;
   }

   public boolean iIlIlllllill() {
      return this.IIllIiilll;
   }

   public boolean iliIiiliiiii() {
      return this.IlllIiilll;
   }

   private lilliIlliilliIll(List<IIlIIIilIlIIIi> boxes, boolean hazard, boolean trap, boolean interactive, boolean ownDirt, boolean reserved, boolean foreign) {
      this.liIlIiilll = boxes;
      this.iiIlIiilll = hazard;
      this.IIllIiilll = trap;
      this.lIllIiilll = interactive;
      this.iIllIiilll = ownDirt;
      this.IlllIiilll = reserved;
      this.llllIiilll = foreign;
   }

   public boolean IilliliilIIi() {
      return this.lIllIiilll;
   }

   public boolean lIiiIiIlilli() {
      return this.iIllIiilll;
   }

   public boolean IIIllIIliIIl() {
      return this.llllIiilll;
   }
}
