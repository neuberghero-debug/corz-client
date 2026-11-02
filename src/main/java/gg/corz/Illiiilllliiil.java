package gg.corz;

import java.util.List;

public record Illiiilllliiil(
   ilIlIIliIiIlIIli status,
   List<liIIIlliiIIIll> steps,
   List<lIiliiliIiliil> placedOrder,
   List<lIiliiliIiliil> unsolved,
   List<iIIIliiIlIIlii> blockers,
   List<ilIiiiIiIiii> cycles,
   int dirtPlaced,
   String escalations
) {
   private final List<iIIIliiIlIIlii> IIlIIillilIlIIilli;
   private final List<lIiliiliIiliil> liIIIilliiiIIIilli;
   private final List<lIiliiliIiliil> ilIIIilliIiIIIilli;
   private final int lllIIilliillIIilli;
   private final String IilIIillililIIilli;
   private final List<liIIIlliiIIIll> IlIIIillillIIIilli;
   private final ilIlIIliIiIlIIli lIIIIilliiIIIIilli;
   private final List<ilIiiiIiIiii> iIlIIilliIllIIilli;

   public boolean IliIlllilIi() {
      return this.lIIIIilliiIIIIilli == ilIlIIliIiIlIIli.iIlIllIlIi;
   }

   public List<lIiliiliIiliil> iliIiiliiiii() {
      return this.liIIIilliiiIIIilli;
   }

   public String IIlllIlliIll() {
      return this.IilIIillililIIilli;
   }

   public Illiiilllliiil(
      ilIlIIliIiIlIIli status,
      List<liIIIlliiIIIll> steps,
      List<lIiliiliIiliil> placedOrder,
      List<lIiliiliIiliil> unsolved,
      List<iIIIliiIlIIlii> blockers,
      List<ilIiiiIiIiii> cycles,
      int dirtPlaced,
      String escalations
   ) {
      this.lIIIIilliiIIIIilli = status;
      this.IlIIIillillIIIilli = steps;
      this.ilIIIilliIiIIIilli = placedOrder;
      this.liIIIilliiiIIIilli = unsolved;
      this.IIlIIillilIlIIilli = blockers;
      this.iIlIIilliIllIIilli = cycles;
      this.lllIIilliillIIilli = dirtPlaced;
      this.IilIIillililIIilli = escalations;
   }

   public List<ilIiiiIiIiii> IlIlllIlilIl() {
      return this.iIlIIilliIllIIilli;
   }

   public List<liIIIlliiIIIll> IilliliilIIi() {
      return this.IlIIIillillIIIilli;
   }

   public int liiiIIllIl() {
      return (int)this.IlIIIillillIIIilli.stream().filter(s -> s.IliIlllilIi() == ilIlIilIiIlIil.IIiiiilIilIiiiilIi).count();
   }

   public List<iIIIliiIlIIlii> IIIllIIliIIl() {
      return this.IIlIIillilIlIIilli;
   }

   public int IiIlliIliiIl() {
      return this.lllIIilliillIIilli;
   }

   public ilIlIIliIiIlIIli iIlIlllllill() {
      return this.lIIIIilliiIIIIilli;
   }

   public List<lIiliiliIiliil> lIiiIiIlilli() {
      return this.ilIIIilliIiIIIilli;
   }
}
