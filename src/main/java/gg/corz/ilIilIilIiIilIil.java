package gg.corz;

import java.util.List;

public record ilIilIilIiIilIil(IliIIilliIIi status, List<iillIilIIilIil> nodes, double ticks, float hp, int expanded) {
   private final float iiliiIlIil;
   private final List<iillIilIIilIil> IiliiIlIil;
   private final double liliiIlIil;
   private final IliIIilliIIi illiiIlIil;
   private final int IIiiiIlIil;

   public double iIlIlllllill() {
      return this.liliiIlIil;
   }

   public ilIilIilIiIilIil(IliIIilliIIi status, List<iillIilIIilIil> nodes, double ticks, float hp, int expanded) {
      this.illiiIlIil = status;
      this.IiliiIlIil = nodes;
      this.liliiIlIil = ticks;
      this.iiliiIlIil = hp;
      this.IIiiiIlIil = expanded;
   }

   public IliIIilliIIi IliIlllilIi() {
      return this.illiiIlIil;
   }

   public int lIiiIiIlilli() {
      return this.IIiiiIlIil;
   }

   public float IilliliilIIi() {
      return this.iiliiIlIil;
   }

   public List<iillIilIIilIil> liiiIIllIl() {
      return this.IiliiIlIil;
   }
}
