package gg.corz;

import java.util.List;
import java.util.Set;

public record illIlIllIilIlIll(
   long id,
   lIIlllliIIllll result,
   IIilliIllIilliIl schematicTarget,
   IIilliIllIilliIl dirtGoal,
   IIilliIllIilliIl start,
   IIilliIllIilliIl firstConstructionStand,
   IIilliIllIilliIl finalSupportStand,
   IIilliIllIilliIl finalSchematicPlacementStand,
   List<lliiIiililiiIiil> steps,
   Set<IIilliIllIilliIl> plannedDirt,
   Set<IIilliIllIilliIl> reusedOwnedDirt,
   boolean egressSafe,
   int firstActionCandidates,
   int exploredStates,
   long fingerprint
) {
   private final IIilliIllIilliIl liIiIillll;
   private final lIIlllliIIllll ilIiIillll;
   private final long llIiIillll;
   private final int liliIillll;
   private final IIilliIllIilliIl IiIiIillll;
   private final IIilliIllIilliIl iIliIillll;
   private final Set<IIilliIllIilliIl> illiIillll;
   private final List<lliiIiililiiIiil> IlliIillll;
   private final boolean IiliIillll;
   private final int iiliIillll;
   private final IIilliIllIilliIl iiIiIillll;
   private final IIilliIllIilliIl lIliIillll;
   private final Set<IIilliIllIilliIl> llliIillll;
   private final IIilliIllIilliIl IIliIillll;
   private final long IIiiIillll;

   public boolean IliIlllilIi() {
      return this.ilIiIillll == lIIlllliIIllll.IliIiliillliIiliil;
   }

   public IIilliIllIilliIl lIiiIiIlilli() {
      return this.liIiIillll;
   }

   public long IIIilIIiiIIi() {
      return this.IIiiIillll;
   }

   public IIilliIllIilliIl IiIlliIliiIl() {
      return this.iIliIillll;
   }

   public int Iiilliiliiil() {
      return this.iiliIillll;
   }

   public IIilliIllIilliIl IilliliilIIi() {
      return this.IiIiIillll;
   }

   public Set<IIilliIllIilliIl> Illlllllilll() {
      return this.llliIillll;
   }

   public Set<IIilliIllIilliIl> Iilllilliill() {
      return this.illiIillll;
   }

   public illIlIllIilIlIll(
      long id,
      lIIlllliIIllll result,
      IIilliIllIilliIl schematicTarget,
      IIilliIllIilliIl dirtGoal,
      IIilliIllIilliIl start,
      IIilliIllIilliIl firstConstructionStand,
      IIilliIllIilliIl finalSupportStand,
      IIilliIllIilliIl finalSchematicPlacementStand,
      List<lliiIiililiiIiil> steps,
      Set<IIilliIllIilliIl> plannedDirt,
      Set<IIilliIllIilliIl> reusedOwnedDirt,
      boolean egressSafe,
      int firstActionCandidates,
      int exploredStates,
      long fingerprint
   ) {
      steps = List.copyOf(steps == null ? List.of() : steps);
      plannedDirt = Set.copyOf(plannedDirt == null ? Set.of() : plannedDirt);
      reusedOwnedDirt = Set.copyOf(reusedOwnedDirt == null ? Set.of() : reusedOwnedDirt);
      this.llIiIillll = id;
      this.ilIiIillll = result;
      this.IiIiIillll = schematicTarget;
      this.liIiIillll = dirtGoal;
      this.iiIiIillll = start;
      this.IIliIillll = firstConstructionStand;
      this.lIliIillll = finalSupportStand;
      this.iIliIillll = finalSchematicPlacementStand;
      this.IlliIillll = steps;
      this.llliIillll = plannedDirt;
      this.illiIillll = reusedOwnedDirt;
      this.IiliIillll = egressSafe;
      this.liliIillll = firstActionCandidates;
      this.iiliIillll = exploredStates;
      this.IIiiIillll = fingerprint;
   }

   public lIIlllliIIllll iIlIlllllill() {
      return this.ilIiIillll;
   }

   public int Ililllililil() {
      return this.liliIillll;
   }

   public IIilliIllIilliIl IlIlllIlilIl() {
      return this.lIliIillll;
   }

   public List<lliiIiililiiIiil> IIlllIlliIll() {
      return this.IlliIillll;
   }

   public long liiiIIllIl() {
      return this.llIiIillll;
   }

   public boolean IIillIiliIil() {
      return this.IiliIillll;
   }

   public IIilliIllIilliIl iliIiiliiiii() {
      return this.iiIiIillll;
   }

   public IIilliIllIilliIl IIIllIIliIIl() {
      return this.IIliIillll;
   }
}
