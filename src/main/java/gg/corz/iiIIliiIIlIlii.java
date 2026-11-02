package gg.corz;

public record iiIIliiIIlIlii(String name, int parent, float[] pivot, float[] rotation, float[] vertices, int arm, float[] grip) {
   private final float[] iIIliIiIIl;
   private final int IlIliIiIIl;
   private final float[] lIIliIiIIl;
   private final float[] IIIliIiIIl;
   private final String liiIiIiIIl;
   private final float[] llIliIiIIl;
   private final int iiiIiIiIIl;

   public float[] IIIllIIliIIl() {
      return this.llIliIiIIl;
   }

   public float[] iIlIlllllill() {
      return this.IIIliIiIIl;
   }

   public String IliIlllilIi() {
      return this.liiIiIiIIl;
   }

   public iiIIliiIIlIlii(String vertices, int pivot, float[] name, float[] arm, float[] parent, int rotation) {
      this(vertices, pivot, name, arm, parent, rotation, null);
   }

   public int liiiIIllIl() {
      return this.iiiIiIiIIl;
   }

   public int iliIiiliiiii() {
      return this.IlIliIiIIl;
   }

   public iiIIliiIIlIlii(String name, int parent, float[] pivot, float[] rotation, float[] vertices, int arm, float[] grip) {
      this.liiIiIiIIl = name;
      this.iiiIiIiIIl = parent;
      this.IIIliIiIIl = pivot;
      this.lIIliIiIIl = rotation;
      this.iIIliIiIIl = vertices;
      this.IlIliIiIIl = arm;
      this.llIliIiIIl = grip;
   }

   public float[] lIiiIiIlilli() {
      return this.iIIliIiIIl;
   }

   public float[] IilliliilIIi() {
      return this.lIIliIiIIl;
   }
}
