package gg.corz;

import java.util.List;

public record lIilliIill(
   ilIIiIiIIi kind,
   long familyRoot,
   int membersServed,
   List<lIiliiliIiliil> servedMembers,
   lIiliiliIiliil boundary,
   Illiiilllliiil mission,
   int dirt,
   List<lIiliiliIiliil> boundaryCandidates,
   String why
) {
   private final int iliIIIiIiiIIIi;
   private final int llIlIIiilIlIIi;
   private final List<lIiliiliIiliil> IiIlIIiliIlIIi;
   private final long IliIIIilliIIIi;
   private final String iiIlIIiIIllIIi;
   private final lIiliiliIiliil IIIlIIilIIlIIi;
   private final ilIIiIiIIi lIiIIIiiIiIIIi;
   private final Illiiilllliiil iIIlIIiIlIlIIi;
   private final List<lIiliiliIiliil> liiIIIiiiiIIIi;

   public ilIIiIiIIi liiiIIllIl() {
      return this.lIiIIIiiIiIIIi;
   }

   public lIiliiliIiliil iliIiiliiiii() {
      return this.IIIlIIilIIlIIi;
   }

   public Illiiilllliiil IIIllIIliIIl() {
      return this.iIIlIIiIlIlIIi;
   }

   public int IilliliilIIi() {
      return this.iliIIIiIiiIIIi;
   }

   public long iIlIlllllill() {
      return this.IliIIIilliIIIi;
   }

   public List<lIiliiliIiliil> lIiiIiIlilli() {
      return this.liiIIIiiiiIIIi;
   }

   public List<lIiliiliIiliil> IiIlliIliiIl() {
      return this.IiIlIIiliIlIIi;
   }

   public String IIlllIlliIll() {
      return this.iiIlIIiIIllIIi;
   }

   public lIilliIill(
      ilIIiIiIIi kind,
      long familyRoot,
      int membersServed,
      List<lIiliiliIiliil> servedMembers,
      lIiliiliIiliil boundary,
      Illiiilllliiil mission,
      int dirt,
      List<lIiliiliIiliil> boundaryCandidates,
      String why
   ) {
      kind = kind == null ? ilIIiIiIIi.iIiiiliIliiili : kind;
      servedMembers = servedMembers == null ? List.of() : List.copyOf(servedMembers);
      boundaryCandidates = boundaryCandidates == null ? List.of() : List.copyOf(boundaryCandidates);
      why = why == null ? "" : why;
      this.lIiIIIiiIiIIIi = kind;
      this.IliIIIilliIIIi = familyRoot;
      this.iliIIIiIiiIIIi = membersServed;
      this.liiIIIiiiiIIIi = servedMembers;
      this.IIIlIIilIIlIIi = boundary;
      this.iIIlIIiIlIlIIi = mission;
      this.llIlIIiilIlIIi = dirt;
      this.IiIlIIiliIlIIi = boundaryCandidates;
      this.iiIlIIiIIllIIi = why;
   }

   public boolean IliIlllilIi() {
      return this.lIiIIIiiIiIIIi == ilIIiIiIIi.IIiiililIiiili && this.iIIlIIiIlIlIIi != null && !this.iIIlIIiIlIlIIi.IilliliilIIi().isEmpty();
   }

   public int IlIlllIlilIl() {
      return this.llIlIIiilIlIIi;
   }
}
