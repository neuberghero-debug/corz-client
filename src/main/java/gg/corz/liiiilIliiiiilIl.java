package gg.corz;

import java.util.Objects;

public record liiiilIliiiiilIl(
   long planId,
   IIilliIllIilliIl schematicTarget,
   String expectedState,
   IIilliIllIilliIl dirtGoal,
   IIilliIllIilliIl start,
   IIilliIllIilliIl finalSchematicPlacementStand,
   int maxRadius,
   int maxVertical,
   int maxDirt,
   int maxSteps,
   int maxStates
) {
   private final IIilliIllIilliIl IIIIlIiIll;
   private final IIilliIllIilliIl IlIIlIiIll;
   private final int ilIIlIiIll;
   private final int IIlIlIiIll;
   private final IIilliIllIilliIl llIIlIiIll;
   private final long iiiiIIiIll;
   private final int IiIIlIiIll;
   private final String lIIIlIiIll;
   private final int liIIlIiIll;
   private final IIilliIllIilliIl iIIIlIiIll;
   private final int iiIIlIiIll;

   public IIilliIllIilliIl lIiiIiIlilli() {
      return this.IlIIlIiIll;
   }

   public IIilliIllIilliIl liiiIIllIl() {
      return this.IIIIlIiIll;
   }

   public liiiilIliiiiilIl(
      long planId,
      IIilliIllIilliIl schematicTarget,
      String expectedState,
      IIilliIllIilliIl dirtGoal,
      IIilliIllIilliIl start,
      IIilliIllIilliIl finalSchematicPlacementStand,
      int maxRadius,
      int maxVertical,
      int maxDirt,
      int maxSteps,
      int maxStates
   ) {
      Objects.requireNonNull(schematicTarget, Iilllilliill<"Iilllilliill","spsGq0+0MSdEtpIr1zIwOh7Lu2zbdp4U105LGjGXmrxQS8TybMjRvGRyQg==">());
      Objects.requireNonNull(expectedState, Iilllilliill<"Iilllilliill","bsfcK8sajV5vSd53iQWtUb8kv+elQ7OAFArCpewTkiaQB+YujuCWgZU=">());
      Objects.requireNonNull(dirtGoal, Iilllilliill<"Iilllilliill","Z0davQXqWRBW27kTG6+gCbLFPTKFn9RsJuEKBDZbW/R9aaEH">());
      Objects.requireNonNull(start, Iilllilliill<"Iilllilliill","agK/TUsTP97CRsH8I1nAPdzPMOTOk7Qkv/34SbnIo9Jz">());
      maxRadius = Math.max(2, maxRadius);
      maxVertical = Math.max(1, maxVertical);
      maxDirt = Math.max(1, maxDirt);
      maxSteps = Math.max(2, maxSteps);
      maxStates = Math.max(32, maxStates);
      this.iiiiIIiIll = planId;
      this.IIIIlIiIll = schematicTarget;
      this.lIIIlIiIll = expectedState;
      this.iIIIlIiIll = dirtGoal;
      this.IlIIlIiIll = start;
      this.llIIlIiIll = finalSchematicPlacementStand;
      this.ilIIlIiIll = maxRadius;
      this.IiIIlIiIll = maxVertical;
      this.liIIlIiIll = maxDirt;
      this.iiIIlIiIll = maxSteps;
      this.IIlIlIiIll = maxStates;
   }

   public int IlIlllIlilIl() {
      return this.IiIIlIiIll;
   }

   public int Illlllllilll() {
      return this.IIlIlIiIll;
   }

   public int IIIllIIliIIl() {
      return this.ilIIlIiIll;
   }

   public int IIlllIlliIll() {
      return this.iiIIlIiIll;
   }

   public IIilliIllIilliIl iliIiiliiiii() {
      return this.llIIlIiIll;
   }

   public int IiIlliIliiIl() {
      return this.liIIlIiIll;
   }

   public long IliIlllilIi() {
      return this.iiiiIIiIll;
   }

   public String iIlIlllllill() {
      return this.lIIIlIiIll;
   }

   public IIilliIllIilliIl IilliliilIIi() {
      return this.iIIIlIiIll;
   }
}
