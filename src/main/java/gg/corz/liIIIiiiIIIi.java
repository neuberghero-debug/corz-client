package gg.corz;

public record liIIIiiiIIIi(long target, long stand, String material, String face, float yaw, float pitch, boolean edge, boolean hotbar, int tier) {
   private final String Iililliililillii;
   private final String lllilliiillillii;
   private final boolean Iliilliilliillii;
   private final boolean iliilliiIiiillii;
   private final float lIiilliiiIiillii;
   private final float iililliiIIiillii;
   private final long IIlilliilIlillii;
   private final long iIlilliiIllillii;
   private final int liiilliiiiiillii;

   public float lIiiIiIlilli() {
      return this.iililliiIIiillii;
   }

   public float iliIiiliiiii() {
      return this.lIiilliiiIiillii;
   }

   public long liiiIIllIl() {
      return this.iIlilliiIllillii;
   }

   public String iIlIlllllill() {
      return this.lllilliiillillii;
   }

   public liIIIiiiIIIi(long target, long stand, String material, String face, float yaw, float pitch, boolean edge, boolean hotbar, int tier) {
      this.IIlilliilIlillii = target;
      this.iIlilliiIllillii = stand;
      this.lllilliiillillii = material;
      this.Iililliililillii = face;
      this.iililliiIIiillii = yaw;
      this.lIiilliiiIiillii = pitch;
      this.Iliilliilliillii = edge;
      this.iliilliiIiiillii = hotbar;
      this.liiilliiiiiillii = tier;
   }

   public String IilliliilIIi() {
      return this.Iililliililillii;
   }

   public boolean IIIllIIliIIl() {
      return this.Iliilliilliillii;
   }

   public boolean IlIlllIlilIl() {
      return this.iliilliiIiiillii;
   }

   public liIIIiiiIIIi(long target, long pitch, String edge, String hotbar, float material, float face, boolean stand, boolean yaw) {
      this(target, pitch, edge, hotbar, material, face, stand, yaw, stand ? 1 : 0);
   }

   public int IiIlliIliiIl() {
      return this.liiilliiiiiillii;
   }

   public long IliIlllilIi() {
      return this.IIlilliilIlillii;
   }
}
