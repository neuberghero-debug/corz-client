package gg.corz;

import java.util.List;

public record liiiiiiiii(long goal, List<Long> path, int expanded, boolean budgetExhausted, int openRemaining, long[] footprint) {
   private final long[] iiilliIlIIIiliIl;
   private final boolean llilliIlililliIl;
   private final long lillliIliillliIl;
   private final int iIilliIlIlilliIl;
   private final int IiilliIlliilliIl;
   private final List<Long> IIilliIllIilliIl;

   public List<Long> iIlIlllllill() {
      return this.IIilliIllIilliIl;
   }

   public boolean IliIlllilIi() {
      return this.IIilliIllIilliIl != null;
   }

   public liiiiiiiii(long goal, List<Long> path, int expanded, boolean budgetExhausted, int openRemaining, long[] footprint) {
      this.lillliIliillliIl = goal;
      this.IIilliIllIilliIl = path;
      this.iIilliIlIlilliIl = expanded;
      this.llilliIlililliIl = budgetExhausted;
      this.IiilliIlliilliIl = openRemaining;
      this.iiilliIlIIIiliIl = footprint;
   }

   public int iliIiiliiiii() {
      return this.IiilliIlliilliIl;
   }

   public long[] IIIllIIliIIl() {
      return this.iiilliIlIIIiliIl;
   }

   public boolean lIiiIiIlilli() {
      return this.llilliIlililliIl;
   }

   public liiiiiiiii(long openRemaining, List<Long> goal, int budgetExhausted, boolean path, int expanded) {
      this(openRemaining, goal, budgetExhausted, path, expanded, null);
   }

   public int IilliliilIIi() {
      return this.iIilliIlIlilliIl;
   }

   public long liiiIIllIl() {
      return this.lillliIliillliIl;
   }
}
